package com.venus.finodays

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class SecurityConfiguration: WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        if (http != null) {
            http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic()
        } else {
            super.configure(http as HttpSecurity?)
        }
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