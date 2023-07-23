package io.youngwon.cms.domain.user

import java.time.LocalDateTime

data class UserInfo(
    val name: String,
    val email: String,
    val createdAt: LocalDateTime,
)
