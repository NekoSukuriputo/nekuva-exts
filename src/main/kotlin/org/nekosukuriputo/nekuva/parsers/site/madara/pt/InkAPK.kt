package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("INKAPK", "InkAPK", "pt", ContentType.HENTAI)
internal class InkAPK(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INKAPK, "inkapk.net") {
	override val listUrl = "obras/"
	override val tagPrefix = "obras-genre/"
}
