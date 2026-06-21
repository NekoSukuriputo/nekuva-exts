package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("ZINMANGA_MS", "ZinManga.ms", "en")
internal class ZinMangaMS(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINMANGA_MS, "zinmanga.ms") {
	override val listUrl = "manga-1/"
	override val tagPrefix = "manga-genre-1/"
}
