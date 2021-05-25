package ru.finman.auth.model

data class RegistrationRequest(
	val email: String? = null,
	val name: String? = null,
	val password: String? = null
)