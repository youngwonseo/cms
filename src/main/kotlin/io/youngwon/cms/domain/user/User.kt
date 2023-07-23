package io.youngwon.cms.domain.user

import io.youngwon.cms.common.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class User(
    val email: String,
    val password: String,
    val userId: String,
    var state: UserState = UserState.ACTIVE,
    var deletedAt: LocalDateTime? = null,
    @Id val no: Long = 0,
) : BaseEntity()

enum class UserState {
    ACTIVE, INACTIVE, DELETED,
}
