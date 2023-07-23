package io.youngwon.cms.domain.site

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SiteServiceImpl(
    private val siteReader: SiteReader,
    private val siteStore: SiteStore,
) : SiteService {

    @Transactional(readOnly = true)
    override fun getSite(siteId: String): SiteInfo =
        SiteInfo(siteReader.getOne(siteId))

    @Transactional
    override fun createSite(command: SiteCreateCommand): SiteInfo =
        SiteInfo(siteStore.store(command.toEntity()))

    @Transactional
    override fun updateSite(siteId: String, command: SiteUpdateCommand): SiteInfo {
        val site = siteReader.getOne(siteId)
        site.name = command.name
        return SiteInfo(site)
    }

    @Transactional
    override fun deleteSite(siteId: String) {
        val site = siteReader.getOne(siteId)
        site.delete()
        siteStore.store(site)
    }

}
