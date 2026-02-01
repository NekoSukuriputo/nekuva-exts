package org.dokiteam.doki.parsers.site.natsu.id

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.model.MangaPage
import org.dokiteam.doki.parsers.model.MangaChapter
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.natsu.NatsuParser
import org.dokiteam.doki.parsers.util.generateUid
import org.dokiteam.doki.parsers.util.parseHtml
import org.dokiteam.doki.parsers.util.requireSrc
import org.dokiteam.doki.parsers.util.toAbsoluteUrl
import org.dokiteam.doki.parsers.util.toRelativeUrl

@MangaSourceParser("KIRYUU", "Kiryuu", "id")
internal class Kiryuu(context: MangaLoaderContext) :
	NatsuParser(context, MangaParserSource.KIRYUU, pageSize = 24) {
	override val configKeyDomain = ConfigKey.Domain(
		"kiryuu03.com",
		"kiryuu04.com",
		"kiryuu05.com",
		"kiryuu.id",
	)

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		// Images are in a section with data-image-data attribute
		return doc.select("section[data-image-data] img").map { img ->
			val url = img.requireSrc().toRelativeUrl(domain)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
