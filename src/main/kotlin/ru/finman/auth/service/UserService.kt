package ru.finman.auth.service

import org.springframework.stereotype.Service
import ru.finman.auth.model.User
import ru.finman.auth.repository.UserRepository

@Service
class UserService(
	private val userRepository: UserRepository
) {
	fun saveUser(email: String, name: String, password: String): User = userRepository.save(User(email, name, password))

	fun getUserByEmail(email: String): User = userRepository.findUserByEmail(email)
}