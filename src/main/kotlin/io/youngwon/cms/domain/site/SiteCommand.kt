package io.youngwon.cms.domain.site

data class SiteCreateCommand(
    val siteId: String,
    val name: String,
) {

    fun toEntity(): Site =
        Site(siteId = siteId, name = name)
}

data class SiteUpdateCommand(
    val name: String,
)
