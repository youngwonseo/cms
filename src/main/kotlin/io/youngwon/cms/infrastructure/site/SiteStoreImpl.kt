package io.youngwon.cms.infrastructure.site

import io.youngwon.cms.domain.site.Site
import io.youngwon.cms.domain.site.SiteStore
import org.springframework.stereotype.Component

@Component
class SiteStoreImpl(
    private val siteRepository: SiteRepository,
) : SiteStore {
    override fun store(site: Site): Site = siteRepository.save(site)
}
