package ru.finman.auth.api.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import ru.finman.auth.model.RegistrationRequest

@RestController("/api/auth")
class AuthController {

	@PostMapping
	fun login(@RequestHeader("TOKEN") token: String) {
	}

	@PostMapping
	fun registration(@RequestBody registrationRequest: RegistrationRequest): ResponseEntity<String> {
		return ResponseEntity.ok("JWT")
	}
}