package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MASTERKOMIK", "Tenshi", "id")
internal class MasterKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MASTERKOMIK, "tenshi01.id", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val listUrl = "/komik"
}
