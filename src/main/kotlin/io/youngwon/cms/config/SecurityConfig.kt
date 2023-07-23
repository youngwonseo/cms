package io.youngwon.cms.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class SecurityConfig {

    @Bean
    fun passwordEncoder(): PasswordEncoder? {
        // You can adjust the strength parameter (second argument) to increase hashing complexity
        return BCryptPasswordEncoder(12)
    }
}
