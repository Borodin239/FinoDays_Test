package com.venus.finodays.user.repository

import com.venus.finodays.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmailAndPassword(email: String, password: String): Optional<User>
}
