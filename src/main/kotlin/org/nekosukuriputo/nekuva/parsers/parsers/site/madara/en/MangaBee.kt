package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

// redirect to @MangaZin
@MangaSourceParser("MANGABEE", "MangaBee", "en", ContentType.HENTAI)
internal class MangaBee(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGABEE, "mangazin.org") {
	override val datePattern = "MM/dd/yyyy"
}
