package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASORIGINES", "MangasOrigines.fr", "fr")
internal class MangasOrigines(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASORIGINES, "mangas-origines.fr") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-genres/"
	override val listUrl = "oeuvre/"
}
