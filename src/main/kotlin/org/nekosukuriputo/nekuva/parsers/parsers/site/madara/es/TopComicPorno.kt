package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPCOMICPORNO", "TopComicPorno", "es", ContentType.HENTAI)
internal class TopComicPorno(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPCOMICPORNO, "topcomicporno.net", 18) {
	override val datePattern = "MMM dd, yy"
}
