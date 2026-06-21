package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICSVALLEY", "ComicsValley", "en", ContentType.HENTAI)
internal class ComicsValley(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICSVALLEY, "comicsvalley.com") {
	override val listUrl = "adult-comics/"
	override val tagPrefix = "comic-genre/"
	override val datePattern = "dd/MM/yyyy"
}
