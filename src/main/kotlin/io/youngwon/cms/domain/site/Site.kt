package io.youngwon.cms.domain.site

import io.youngwon.cms.common.entity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Site(
    /**
     * 사용자가 지정한 사이트 식별자
     */
    val siteId: String,
    var name: String,
    var state: SiteState = SiteState.ACTIVE,
    var deletedAt: LocalDateTime? = null,
    @Id val no: Long = 0,
) : BaseEntity() {

    fun delete() {
        state = SiteState.DELETED
        deletedAt = LocalDateTime.now()
    }

}


enum class SiteState {
    ACTIVE, INACTIVE, DELETED,
}