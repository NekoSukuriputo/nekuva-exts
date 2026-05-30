package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LECTORMANGA", "LectorManga", "es")
internal class LectorManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORMANGA, "lectormangaa.com") {
	override val listUrl = "biblioteca/"
	override val tagPrefix = "comics-genero/"
}
