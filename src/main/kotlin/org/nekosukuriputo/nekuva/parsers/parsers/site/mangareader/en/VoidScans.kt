package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Redirect to HiveComic")
@MangaSourceParser("VOIDSCANS", "HiveToon", "en")
internal class VoidScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VOIDSCANS, "hivetoon.com", pageSize = 15, searchPageSize = 10)
