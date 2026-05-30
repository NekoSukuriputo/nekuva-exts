package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Website, come back soon")
@MangaSourceParser("ASTRALMANGA", "AstralManga", "fr")
internal class AstralManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASTRALMANGA, "astral-manga.fr") {
	override val datePattern = "dd/MM/yyyy"
}
