package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SAPPHIRESCAN", "SapphireScan", "es")
internal class SapphireScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SAPPHIRESCAN, "sapphirescan.com")
