package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SEREINSCAN", "SereinScan", "tr")
internal class SereinScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SEREINSCAN, "sereinscan.com", pageSize = 20, searchPageSize = 10)
