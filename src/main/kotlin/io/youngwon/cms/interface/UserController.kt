package io.youngwon.cms.`interface`

import io.youngwon.cms.application.user.UserFacade
import io.youngwon.cms.`interface`.request.LoginRequest
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(
    userFacade: UserFacade,
) {

    fun login(request: LoginRequest) {

    }

    fun logout() {

    }

    fun forgotEmail() {

    }

    fun changePassword() {

    }
}
