package io.youngwon.cms.domain.user

class UserCommand {
    data class UserLoginCommand(
        val email: String,
        val password: String,
    )

    data class UserCreateCommand(
        val name: String,
        val email: String,
        val password: String,
    )
}
