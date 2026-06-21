package org.nekosukuriputo.nekuva.parsers.site.manga18.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.manga18.Manga18Parser

@MangaSourceParser("MANGA18", "Manga18", "en", ContentType.HENTAI)
internal class Manga18(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.MANGA18, "manga18.club")
