package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NOXSUBS", "NoxSubs", "tr")
internal class NoxSubs(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NOXSUBS, "noxsubs.net", pageSize = 20, searchPageSize = 10)
