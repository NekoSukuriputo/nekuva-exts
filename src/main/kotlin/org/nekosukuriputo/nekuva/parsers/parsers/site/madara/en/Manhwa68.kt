package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWA68", "Manhwa68", "en", ContentType.HENTAI)
internal class Manhwa68(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWA68, "manhwa68.com")
