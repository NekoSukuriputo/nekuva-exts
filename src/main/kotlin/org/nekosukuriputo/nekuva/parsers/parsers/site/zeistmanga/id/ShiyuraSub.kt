package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.MangaTag
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser
import org.nekosukuriputo.nekuva.parsers.util.mapToSet
import org.nekosukuriputo.nekuva.parsers.util.parseHtml

@MangaSourceParser("SHIYURASUB", "ShiyuraSub", "id")
internal class ShiyuraSub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SHIYURASUB, "shiyurasub.blogspot.com") {

	override val selectTags = ".leading-8 div.my-5.gap-2 a"

	override suspend fun fetchAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.select("div.list-label-widget-content ul li a").mapToSet {
			MangaTag(
				key = it.attr("href").removeSuffix("/").substringAfterLast('/'),
				title = it.html().substringBefore("<span"),
				source = source,
			)
		}
	}

}
