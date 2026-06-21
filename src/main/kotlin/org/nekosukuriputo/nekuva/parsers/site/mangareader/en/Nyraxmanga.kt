package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NYRAXMANGA", "Nyraxmanga", "en")
internal class Nyraxmanga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NYRAXMANGA, "nyraxmanga.com", pageSize = 20, searchPageSize = 10)
