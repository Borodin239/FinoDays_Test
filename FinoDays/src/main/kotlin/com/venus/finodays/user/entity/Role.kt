package com.venus.finodays.user.entity

import org.springframework.security.core.GrantedAuthority
import javax.persistence.*

@Entity
@Table(name = "roles")
class Role(

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "role_seq"
    )
    @SequenceGenerator(
        name = "role_seq",
        allocationSize = 1
    )
    val id: Long,

    val name: String

) : GrantedAuthority {
    override fun getAuthority(): String {
        return name
    }
}
