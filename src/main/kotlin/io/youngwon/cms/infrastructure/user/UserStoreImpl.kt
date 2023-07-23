package io.youngwon.cms.infrastructure.user

import org.springframework.stereotype.Component

@Component
class UserStoreImpl(
    private val userRepository: UserRepository,
) {

}
