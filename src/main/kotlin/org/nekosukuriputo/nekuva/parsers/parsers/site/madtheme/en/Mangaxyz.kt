package org.nekosukuriputo.nekuva.parsers.site.madtheme.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaChapter
import org.nekosukuriputo.nekuva.parsers.model.MangaPage
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madtheme.MadthemeParser
import org.nekosukuriputo.nekuva.parsers.util.toAbsoluteUrl
import org.nekosukuriputo.nekuva.parsers.util.generateUid
import org.nekosukuriputo.nekuva.parsers.util.parseHtml

@MangaSourceParser("MANGAXYZ", "MangaXyz", "en")
internal class Mangaxyz(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.MANGAXYZ, "mangaxyz.com") {

    private val subDomain = "sb.mbcdn.xyz"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val regexPages = Regex("chapImages\\s*=\\s*['\"](.*?)['\"]")
		val pages = doc.select("script").firstNotNullOfOrNull { script ->
			regexPages.find(script.html())?.groupValues?.getOrNull(1)
		}?.split(',')

		return pages?.map { url ->
			val cleanUrl = url.substringAfter("/manga")
			MangaPage(
				id = generateUid(url),
				url = "https://$subDomain/manga$cleanUrl",
				preview = null,
				source = source,
			)
		} ?: emptyList()
	}

}
