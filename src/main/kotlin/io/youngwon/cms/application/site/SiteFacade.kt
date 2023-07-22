package io.youngwon.cms.application.site

import io.youngwon.cms.domain.site.SiteService
import org.springframework.stereotype.Service

@Service
class SiteFacade(
    private val siteService: SiteService,
) {

}