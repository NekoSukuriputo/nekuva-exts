package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("JIANGZAITOON", "JiangzaiToon", "tr", ContentType.HENTAI)
internal class Jiangzaitoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JIANGZAITOON, "jiangzaitoon.top") {
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
