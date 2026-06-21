package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAECLIPSE", "MangaEclipse", "en")
internal class MangaEclipse(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAECLIPSE, "mangaeclipse.com")
