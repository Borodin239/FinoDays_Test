package com.venus.finodays.user

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
}
