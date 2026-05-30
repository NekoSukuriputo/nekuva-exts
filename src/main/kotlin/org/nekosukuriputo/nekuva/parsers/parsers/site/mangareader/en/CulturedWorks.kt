package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CULTUREDWORKS", "CulturedWorks", "en")
internal class CulturedWorks(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.CULTUREDWORKS,
		"culturedworks.com",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val selectMangaList = ".listupd .bs .bsx"
}
