package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite")
@MangaSourceParser("ZEVEP", "Zevep", "es")
internal class Zevep(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZEVEP, "zevep.com", 16)
