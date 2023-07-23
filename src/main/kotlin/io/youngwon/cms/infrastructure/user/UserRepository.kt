package io.youngwon.cms.infrastructure.user

import io.youngwon.cms.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
