package ru.finman.auth.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class User(
	@Id val email: String? = null,
	@Column val name: String? = null,
	@Column val password: String? = null,
	@Column val accessToken: String? = null,
	@Column val refreshToken: String? = null
)