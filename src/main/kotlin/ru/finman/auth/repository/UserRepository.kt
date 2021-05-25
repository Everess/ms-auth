package ru.finman.auth.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.finman.auth.model.User

@Repository
interface UserRepository : CrudRepository<User, String> {
	fun findUserByEmail(email: String): User
}