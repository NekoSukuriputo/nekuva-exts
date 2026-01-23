package org.dokiteam.doki.parsers.site.madara.tr

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.madara.MadaraParser
import org.dokiteam.doki.parsers.util.getCookies

//This source requires an account.
@MangaSourceParser("GRIMELEK", "SiyahMelek", "tr")
internal class Grimelek(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GRIMELEK, "siyahmelek.pro", 20) {
	override val datePattern = "d MMMM yyyy"
	override val listUrl = "seri/"
	override val authUrl: String
		get() = "https://${domain}"

	override suspend fun isAuthorized(): Boolean {
		return context.cookieJar.getCookies(domain).any {
			it.name.contains("wordpress_logged")
		}
	}
}
