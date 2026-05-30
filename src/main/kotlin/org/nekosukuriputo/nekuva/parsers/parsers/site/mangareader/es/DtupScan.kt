package org.nekosukuriputo.nekuva.parsers.site.mangareader.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DTUPSCAN", "DtupScan", "es")
internal class DtupScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DTUPSCAN, "dtupscan.com", pageSize = 20, searchPageSize = 10)
