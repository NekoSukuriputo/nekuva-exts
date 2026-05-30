package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("MMDAOS", "Mmdaos", "es")
internal class Mmdaos(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MMDAOS, "mmdaos.com")
