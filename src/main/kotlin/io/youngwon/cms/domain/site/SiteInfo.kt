package io.youngwon.cms.domain.site

data class SiteInfo(
    val siteId: String,
    val name: String,
) {
    constructor(site: Site) : this(site.siteId, site.name) {

    }
}
