package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("FBSQUADS", "FbSquads", "pt", ContentType.HENTAI)
internal class Fbsquads(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FBSQUADS, "fbsquadx.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
