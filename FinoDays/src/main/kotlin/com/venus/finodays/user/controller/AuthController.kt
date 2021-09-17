package com.venus.finodays.user.controller

import com.venus.finodays.user.dto.AuthRequestDTO
import com.venus.finodays.user.service.UserService
import com.venus.finodays.user.view.UserView
import com.venus.finodays.user.view.UserViewMapper
import io.swagger.v3.oas.annotations.Operation
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(
    val userService: UserService,
    val userViewMapper: UserViewMapper
) {

    @PostMapping("/signin")
    fun login(
        @RequestBody authRequestDTO: AuthRequestDTO
    ): UserView {
        val user = userService.getSecured(authRequestDTO.email, authRequestDTO.password)
        return userViewMapper.toView(user)
    }
}
