package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("NOINDEXSCAN", "NoindexScan", "pt", ContentType.HENTAI)
internal class NoindexScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOINDEXSCAN, "noindexscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
