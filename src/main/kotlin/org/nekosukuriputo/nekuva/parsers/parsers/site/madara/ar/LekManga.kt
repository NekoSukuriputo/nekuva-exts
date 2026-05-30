package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEK", "LekManga", "ar")
internal class LekManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEK, "lekmanga.net", pageSize = 10)
