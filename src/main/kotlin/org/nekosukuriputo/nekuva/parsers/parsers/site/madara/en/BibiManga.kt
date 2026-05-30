package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("BIBIMANGA", "BibiManga", "en", ContentType.HENTAI)
internal class BibiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BIBIMANGA, "bibimanga.com") {
	override val datePattern = "MMMM dd, yyyy"
}
