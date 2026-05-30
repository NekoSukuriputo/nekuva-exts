package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("HARIMANGA", "HariManga", "en")
internal class HariManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HARIMANGA, "harimanga.me", pageSize = 10)
