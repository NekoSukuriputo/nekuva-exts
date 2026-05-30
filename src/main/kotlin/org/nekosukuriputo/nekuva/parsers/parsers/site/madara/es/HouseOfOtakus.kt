package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HOUSEOFOTAKUS", "HouseOfOtakus", "es")
internal class HouseOfOtakus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEOFOTAKUS, "houseofotakus.xyz")
