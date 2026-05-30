package org.nekosukuriputo.nekuva.parsers.site.mangareader.ar

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("NOONSCAN", "NoonScan.com", "ar")
internal class NoonScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NOONSCAN, "noonscan.com", pageSize = 20, searchPageSize = 10)
