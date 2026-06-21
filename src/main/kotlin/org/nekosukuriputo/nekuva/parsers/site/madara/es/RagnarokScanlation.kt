package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("RAGNAROKSCANLATION", "RagnarokScanlation", "es")
internal class RagnarokScanlation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAGNAROKSCANLATION, "ragnarokscanlation.org")
