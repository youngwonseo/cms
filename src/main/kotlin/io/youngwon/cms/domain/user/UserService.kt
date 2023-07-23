package io.youngwon.cms.domain.user

interface UserService {
    fun login(command: UserCommand.UserLoginCommand): UserInfo
    fun createUser(command: UserCommand.UserCreateCommand): UserInfo
}
