package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("KYUMIK", "Kyumik", "id", ContentType.HENTAI)
internal class Kyumik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KYUMIK, "kyumik.com", pageSize = 20, searchPageSize = 10)