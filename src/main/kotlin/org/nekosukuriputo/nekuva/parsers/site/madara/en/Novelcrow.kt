package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("NOVELCROW", "NovelCrow", "en", ContentType.HENTAI)
internal class Novelcrow(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOVELCROW, "novelcrow.com", 24) {
	override val tagPrefix = "comic-genre/"
}
