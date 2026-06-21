package org.nekosukuriputo.nekuva.parsers.site.mangareader.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("SENPAIEDICIONES", "SenpaiEdiciones", "es")
internal class Senpaiediciones(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SENPAIEDICIONES,
		"senpaiediciones.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
}
