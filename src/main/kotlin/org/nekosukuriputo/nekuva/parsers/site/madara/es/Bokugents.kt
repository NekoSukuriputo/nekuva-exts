package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("BOKUGENTS", "Bokugents", "es")
internal class Bokugents(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BOKUGENTS, "bokugents.com")
// For this source need to enable the option to ignore SSL errors
