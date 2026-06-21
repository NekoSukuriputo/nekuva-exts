package org.nekosukuriputo.nekuva.parsers.site.mangareader.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DRAGONMANGA", "DragonManga", "th", ContentType.HENTAI)
internal class DragonManga(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.DRAGONMANGA,
		"www.dragon-manga.com",
		pageSize = 40,
		searchPageSize = 10,
	)
