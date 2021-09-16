package com.venus.finodays.user

interface UserService {
    fun getById(id: Long): User
}
