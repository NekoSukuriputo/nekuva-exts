package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKGO", "KomikGo", "id", ContentType.HENTAI)
internal class KomikGo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKGO, "komikgo.xyz", pageSize = 20, searchPageSize = 10)
