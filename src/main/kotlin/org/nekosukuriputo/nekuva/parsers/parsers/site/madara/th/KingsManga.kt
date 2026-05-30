package org.nekosukuriputo.nekuva.parsers.site.madara.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("KINGS_MANGA", "SuperDoujin", "th", ContentType.HENTAI)
internal class KingsManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KINGS_MANGA, "www.superdoujin.org") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
