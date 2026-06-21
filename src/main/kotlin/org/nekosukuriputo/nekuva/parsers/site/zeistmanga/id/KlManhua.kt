package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.MangaTag
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser
import org.nekosukuriputo.nekuva.parsers.util.mapToSet
import org.nekosukuriputo.nekuva.parsers.util.parseHtml
import org.nekosukuriputo.nekuva.parsers.util.requireElementById

@MangaSourceParser("KLMANHUA", "KlManhua", "id", ContentType.HENTAI)
internal class KlManhua(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.KLMANHUA, "klmanhua.blogspot.com") {

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("LinkList1").select("ul li a").mapToSet {
			MangaTag(
				key = it.attr("href").substringBefore("?").substringAfterLast('/'),
				title = it.text(),
				source = source,
			)
		}
	}
}
