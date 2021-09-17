package com.venus.finodays.user.service

import com.venus.finodays.user.entity.User

interface UserService {
    fun getById(id: Long): User
    fun getSecured(email: String, password: String): User
}
