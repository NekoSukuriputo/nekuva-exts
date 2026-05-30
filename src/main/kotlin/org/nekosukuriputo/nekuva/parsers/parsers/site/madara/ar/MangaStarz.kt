package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASTARZ", "Manga-Starz", "ar")
internal class MangaStarz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASTARZ, "manga-starz.com", pageSize = 10) {
	override val datePattern = "d MMMM، yyyy"
	override val stylePage = ""
}
