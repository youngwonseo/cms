package io.youngwon.cms.infrastructure.site

import io.youngwon.cms.domain.site.Site
import io.youngwon.cms.domain.site.SiteReader
import org.springframework.stereotype.Component

@Component
class SiteReaderImpl(
    private val siteRepository: SiteRepository,
) : SiteReader {
    override fun getOne(id: String): Site = siteRepository.findBySiteId(id)
}
