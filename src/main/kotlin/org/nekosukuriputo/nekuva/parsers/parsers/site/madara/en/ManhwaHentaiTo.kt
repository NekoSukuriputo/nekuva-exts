package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAHENTAITO", "ManhwaHentai.to", "en", ContentType.HENTAI)
internal class ManhwaHentaiTo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAHENTAITO, "manhwahentai.to", 10) {
	override val tagPrefix = "pornhwa-genre/"
	override val listUrl = "pornhwa/"
	override val datePattern = "d MMMM yyyy"
}
