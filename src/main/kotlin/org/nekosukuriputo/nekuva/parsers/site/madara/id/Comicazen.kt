package org.nekosukuriputo.nekuva.parsers.site.madara.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICAZEN", "Comicazen", "id")
internal class Comicazen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICAZEN, "comicazen.com")
