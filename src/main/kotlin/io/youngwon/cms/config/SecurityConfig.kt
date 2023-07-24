package io.youngwon.cms.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.HttpStatusEntryPoint


@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            authorizeRequests {
                authorize("/api/v1/login", permitAll)
                authorize("/api/**", authenticated)
            }
            csrf { disable() }
            httpBasic { disable() }
            exceptionHandling {
                authenticationEntryPoint
                accessDeniedHandler
            }
        }
        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder? {
        // You can adjust the strength parameter (second argument) to increase hashing complexity
        return BCryptPasswordEncoder(12)
    }
}
