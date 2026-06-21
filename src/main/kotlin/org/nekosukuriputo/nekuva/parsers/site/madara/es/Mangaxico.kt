package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAXICO", "MangaXico", "es", ContentType.HENTAI)
internal class Mangaxico(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAXICO, "mangagojo18.com", 24)
