package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("MANGACIM", "Mangacim", "tr")
internal class Mangacim(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGACIM, "mangacim.com.tr", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
}
