package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("GUNCEL_MANGA", "GuncelManga", "tr")
internal class GuncelManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GUNCEL_MANGA, "guncelmanga.net") {
	override val datePattern = "d MMMM yyyy"
}
