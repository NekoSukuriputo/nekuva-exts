package org.nekosukuriputo.nekuva.parsers.site.madara.ru

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Blocked by Cloudflare challenge")
@MangaSourceParser("BEST_MANGA", "BestManga", "ru")
internal class BestManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEST_MANGA, "bestmanga.club") {
	override val datePattern = "dd.MM.yyyy"
	override val postReq = true
}
