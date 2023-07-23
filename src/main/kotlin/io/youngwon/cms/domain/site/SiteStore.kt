package io.youngwon.cms.domain.site

interface SiteStore {
    fun store(site: Site): Site
}
