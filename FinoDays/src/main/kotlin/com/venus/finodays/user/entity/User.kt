package com.venus.finodays.user.entity

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import javax.persistence.*

/**
 * Здесь сделан задел под полноценную авторизацию
 * пользователя с использованием SpringSecurity и JWT,
 * однако в силу ограниченности времени процесс авторизации
 * будет реализован фиктивно, для наглядной работы макета.
 */
@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_seq"
    )
    @SequenceGenerator(
        name = "user_seq",
        allocationSize = 1
    )
    val id: Long,

    val email: String,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "users_roles",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    val roles: MutableCollection<Role>,

    private val password: String
) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return roles
    }

    override fun getPassword() = password

    override fun getUsername() = email

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true

    fun isAdminOrModerator(): Boolean {
        return roles.any { it.name == "ROLE_ADMIN" || it.name == "ROLE_MODERATOR" }
    }
}
