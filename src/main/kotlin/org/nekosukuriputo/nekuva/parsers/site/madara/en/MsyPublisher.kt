package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Root returns HTTP 404 — site gone or restructured")
@MangaSourceParser("MSYPUBLISHER", "MsyPublisher", "en")
internal class MsyPublisher(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MSYPUBLISHER, "msypublisher.com", 20) {
	override val listUrl = "manhua/"
	override val selectGenre = "manhua-genre/"
}
