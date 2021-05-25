package ru.finman.auth.repository

import org.springframework.security.web.csrf.CsrfToken
import org.springframework.security.web.csrf.CsrfTokenRepository
import org.springframework.stereotype.Repository
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Repository
class JwtTokenRepository : CsrfTokenRepository {
	override fun generateToken(request: HttpServletRequest?): CsrfToken {
		TODO("Not yet implemented")
	}

	override fun saveToken(token: CsrfToken?, request: HttpServletRequest?, response: HttpServletResponse?) {
		TODO("Not yet implemented")
	}

	override fun loadToken(request: HttpServletRequest?): CsrfToken {
		TODO("Not yet implemented")
	}
}