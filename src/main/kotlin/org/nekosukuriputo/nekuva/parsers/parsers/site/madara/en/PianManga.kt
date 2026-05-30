package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PIANMANGA", "PianManga", "en")
internal class PianManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PIANMANGA, "pianmanga.me", pageSize = 10) {
	override val datePattern = "MMMM dd, yyyy"
}
