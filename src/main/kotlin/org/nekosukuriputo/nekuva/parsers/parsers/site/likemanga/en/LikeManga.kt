package org.nekosukuriputo.nekuva.parsers.site.likemanga.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.likemanga.LikeMangaParser

@MangaSourceParser("LIKEMANGA", "LikeManga", "en")
internal class LikeManga(context: MangaLoaderContext) :
	LikeMangaParser(context, MangaParserSource.LIKEMANGA, "likemanga.ink")
