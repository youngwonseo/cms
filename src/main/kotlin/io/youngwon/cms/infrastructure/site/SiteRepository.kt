package io.youngwon.cms.infrastructure.site

import io.youngwon.cms.domain.site.Site
import org.springframework.data.jpa.repository.JpaRepository

interface SiteRepository : JpaRepository<Site, Long> {
    fun findBySiteId(siteId: String): Site
}