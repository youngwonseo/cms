package io.youngwon.cms.domain.site

interface SiteService {
    fun getSite(siteId: String): SiteInfo
    fun createSite(command: SiteCreateCommand): SiteInfo
    fun updateSite(siteId: String, command: SiteUpdateCommand): SiteInfo
    fun deleteSite(siteId: String)
}