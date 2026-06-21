package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_KOMI", "MangaKomi", "en")
internal class MangaKomi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_KOMI, "mangakomi.io", pageSize = 18) {
	override val datePattern = "MMMM dd, yyyy"
}
