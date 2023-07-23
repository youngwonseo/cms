package io.youngwon.cms.infrastructure.user

import org.springframework.stereotype.Component

@Component
class UserReaderImpl(
    private val userRepository: UserRepository
) {
}
