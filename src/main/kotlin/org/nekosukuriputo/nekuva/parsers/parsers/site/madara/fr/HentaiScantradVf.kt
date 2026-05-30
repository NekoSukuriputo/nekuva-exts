package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAISCANTRADVF", "Hentai-Scantrad", "fr", ContentType.HENTAI)
internal class HentaiScantradVf(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAISCANTRADVF, "hentai.scantrad-vf.cc") {
	override val datePattern = "d MMMM, yyyy"
}
