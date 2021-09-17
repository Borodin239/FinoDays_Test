package com.venus.finodays.user.repository

import com.venus.finodays.user.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {
    fun findByName(name: String): Role
}
