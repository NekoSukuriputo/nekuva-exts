package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAS_ES", "Manhwas.es", "es", ContentType.HENTAI)
internal class Manhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAS_ES, "manhwas.es", 30)
