package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("HARMONYSCAN", "HarmonyScan", "fr")
internal class HarmonyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HARMONYSCAN, "harmony-scan.fr")
