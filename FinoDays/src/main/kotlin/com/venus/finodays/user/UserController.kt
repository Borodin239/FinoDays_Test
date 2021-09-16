package com.venus.finodays.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user/")
class UserController(
    private val userService: UserService
) {
    @GetMapping("/{userId}")
    fun getApproach(@PathVariable userId: Long): UserView {
        val user = userService.getById(userId)
        return UserView(userId, user.email)
    }
}
