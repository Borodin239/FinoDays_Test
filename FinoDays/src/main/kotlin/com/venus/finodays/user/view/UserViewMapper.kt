package com.venus.finodays.user.view

import com.venus.finodays.user.entity.User
import org.springframework.stereotype.Component

@Component
class UserViewMapper {
    fun toView(user: User): UserView {
        return UserView(
            id = user.id,
            email = user.email
        )
    }
}
