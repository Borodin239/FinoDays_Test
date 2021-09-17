package com.venus.finodays

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration

@Configuration
class SecurityConfiguration: WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        if (http != null) {
            http.cors().configurationSource { corsConfig() }

        } else {
            super.configure(http as HttpSecurity?)
        }
    }

    @Value("http://localhost:8080")
    lateinit var corsAllowedList: List<String>

    private fun corsConfig(): CorsConfiguration {
        val config = CorsConfiguration().applyPermitDefaultValues()
        config.allowedMethods = HttpMethod.values().map { value -> value.name }
        config.allowCredentials = true
        config.allowedOrigins = corsAllowedList
        return config
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        if (auth != null) {
            auth
                .inMemoryAuthentication()
                .withUser("front")
                .password("{bcrypt}\$2b\$05\$FBrgHEz.4UqeZjy79nzNHODz3qvoa6Xu9aZV8./1nE6zqih2V.6G6")
                .roles("ADMIN")
        } else {
            super.configure(auth as AuthenticationManagerBuilder?)
        }
    }
}
