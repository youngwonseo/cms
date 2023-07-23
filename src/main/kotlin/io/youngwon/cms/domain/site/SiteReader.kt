package io.youngwon.cms.domain.site

interface SiteReader {
    fun getOne(id: String): Site
}
