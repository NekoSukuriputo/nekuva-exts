package org.nekosukuriputo.nekuva.parsers.site.onemanga.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("BERSERKSCAN", "BerserkScan", "fr")
internal class BerserkScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.BERSERKSCAN, "berserkscan.com")
