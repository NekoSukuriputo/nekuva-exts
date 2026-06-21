package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LEKMANGAORG", "LekManga.org", "ar")
internal class LekMangaOrg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEKMANGAORG, "lekmanga.org", pageSize = 10) {
	override val listUrl = "readcomics/"
}
