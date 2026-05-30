package org.nekosukuriputo.nekuva.parsers.site.mangareader.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("BANANASCAN", "BananaScan", "fr")
internal class BananaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.BANANASCAN, "banana-scan.com", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
}
