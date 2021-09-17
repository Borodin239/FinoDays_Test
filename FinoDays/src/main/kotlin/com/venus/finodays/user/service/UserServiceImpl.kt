package com.venus.finodays.user.service

import com.venus.finodays.user.repository.UserRepository
import com.venus.finodays.user.entity.User
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class UserServiceImpl(
    private val repository: UserRepository
) : UserService {

    override fun getById(id: Long): User {
        return repository.findById(id)
            .orElseThrow { EntityNotFoundException("User with id: $id doesn't exists") }
    }

    override fun getSecured(email: String, password: String): User {
        return repository.findByEmailAndPassword(email, password)
            .orElseThrow { EntityNotFoundException("Wrong email or password") }
    }
}
