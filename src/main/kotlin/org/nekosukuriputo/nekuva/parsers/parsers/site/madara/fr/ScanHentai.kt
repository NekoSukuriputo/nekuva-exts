package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SCANHENTAI", "ScanHentai", "fr", ContentType.HENTAI)
internal class ScanHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANHENTAI, "scan-hentai.fr") {
	override val datePattern = "dd/MM/yyyy"
}
