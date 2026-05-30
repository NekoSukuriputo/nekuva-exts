package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("CAFECOMYAOI", "CafecomYaoi", "pt", ContentType.HENTAI)
internal class CafecomYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CAFECOMYAOI, "cafecomyaoi.com.br") {
	override val datePattern = "dd/MM/yyyy"
}
