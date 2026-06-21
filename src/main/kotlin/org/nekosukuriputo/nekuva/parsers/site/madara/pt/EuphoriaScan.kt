package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("EUPHORIASCAN", "EuphoriaScan", "pt", ContentType.HENTAI)
internal class EuphoriaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EUPHORIASCAN, "euphoriascan.com", 10) {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
}
