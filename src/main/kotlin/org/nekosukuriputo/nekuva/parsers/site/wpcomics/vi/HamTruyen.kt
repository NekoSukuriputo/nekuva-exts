package org.nekosukuriputo.nekuva.parsers.site.wpcomics.vi

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.Manga
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.MangaState
import org.nekosukuriputo.nekuva.parsers.model.RATING_UNKNOWN
import org.nekosukuriputo.nekuva.parsers.site.wpcomics.WpComicsParser
import org.nekosukuriputo.nekuva.parsers.util.mapNotNullToSet
import org.nekosukuriputo.nekuva.parsers.util.parseHtml
import org.nekosukuriputo.nekuva.parsers.util.textOrNull
import org.nekosukuriputo.nekuva.parsers.util.toAbsoluteUrl
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Website is not responding")
@MangaSourceParser("HAMTRUYEN", "Ham Truyện", "vi")
internal class HamTruyen(context: MangaLoaderContext) :
	WpComicsParser(context, MangaParserSource.HAMTRUYEN, "hamtruyen1.com", 44) {

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val chaptersDeferred = async { getChapters(doc, reversed = true) }
		val tagMap = getOrCreateTagMap()
		val tagsElement = doc.select("li.kind p.col-xs-8 a")
		val mangaTags = tagsElement.mapNotNullToSet { tagMap[it.text()] }
		val author = doc.body().select(selectAut).textOrNull()
		manga.copy(
			description = doc.selectFirst(selectDesc)?.html(),
			altTitles = setOfNotNull(doc.selectFirst("h2.other-name")?.textOrNull()),
			authors = setOfNotNull(author),
			state = doc.selectFirst(selectState)?.let {
				when (it.text()) {
					in ongoing -> MangaState.ONGOING
					in finished -> MangaState.FINISHED
					else -> null
				}
			},
			tags = mangaTags,
			rating = doc.selectFirst("div.star input")?.attr("value")?.toFloatOrNull()?.div(5f) ?: RATING_UNKNOWN,
			chapters = chaptersDeferred.await(),
		)
	}
}
