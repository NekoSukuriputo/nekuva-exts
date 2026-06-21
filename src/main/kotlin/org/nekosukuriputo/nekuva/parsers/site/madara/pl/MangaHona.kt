package org.nekosukuriputo.nekuva.parsers.site.madara.pl

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHONA", "MangaHona", "pl")
internal class MangaHona(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHONA, "mangahona.pl") {
	override val datePattern = "yyyy-MM-dd"
}
