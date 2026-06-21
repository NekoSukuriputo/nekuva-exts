package org.nekosukuriputo.nekuva.parsers.site.foolslide.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("DEATHTOLLSCANS", "DeathTollScans", "en")
internal class Deathtollscans(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.DEATHTOLLSCANS, "reader.deathtollscans.net", 26)
