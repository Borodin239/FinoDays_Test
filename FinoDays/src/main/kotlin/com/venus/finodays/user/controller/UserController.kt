package com.venus.finodays.user.controller

import com.venus.finodays.user.service.UserService
import com.venus.finodays.user.view.UserView
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user/")
class UserController(
    private val userService: UserService
) {
    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long): UserView {
        val user = userService.getById(userId)
        return UserView(userId, user.email)
    }
}
