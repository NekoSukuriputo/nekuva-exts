package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAGOJO", "MangaGojo", "en")
internal class MangaGojo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAGOJO, "mangagojo.com", 30, 20)
