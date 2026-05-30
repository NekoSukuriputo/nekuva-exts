package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("NEATMANGA", "NeatManga", "en")
internal class NeatManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEATMANGA, "neatmangas.com", pageSize = 20) {
	override val datePattern = "dd MMMM yyyy"
}
