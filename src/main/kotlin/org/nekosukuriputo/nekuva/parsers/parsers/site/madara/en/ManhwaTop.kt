package org.nekosukuriputo.nekuva.parsers.site.madara.en

import okhttp3.HttpUrl.Companion.toHttpUrl
import org.jsoup.nodes.Document
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaChapter
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("MANHWATOP", "ManhwaTop", "en")
internal class ManhwaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWATOP, "manhwatop.com") {

	override val postReq = true

	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {

		val url = mangaUrl.toAbsoluteUrl(domain).removeSuffix("/") + "/ajax/chapters/"
		val headers = okhttp3.Headers.Builder()
			.add("X-Requested-With", "XMLHttpRequest")
			.build()
		val doc = webClient.httpPost(url.toHttpUrl(), "", headers).parseHtml()

		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)

		return doc.select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.selectFirst("p")?.text() ?: a.ownText()
			val dateText2 = if (dateText != "Complete") {
				dateText
			} else {
				null
			}
			MangaChapter(
				id = generateUid(href),
				url = link,
				title = name,
				number = i + 1f,
				volume = 0,
				branch = null,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText2,
				),
				scanlator = null,
				source = source,
			)
		}
	}
}
