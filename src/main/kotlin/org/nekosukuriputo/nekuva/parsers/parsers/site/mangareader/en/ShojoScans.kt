package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SHOJOSCANS", "ShojoScans", "en")
internal class ShojoScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SHOJOSCANS, "violetscans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/comics"
}
