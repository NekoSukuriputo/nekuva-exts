package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("DATGARSCANLATION", "DatgarScanlation", "es")
internal class DatgarScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.DATGARSCANLATION, "datgarscanlation.blogspot.com")
