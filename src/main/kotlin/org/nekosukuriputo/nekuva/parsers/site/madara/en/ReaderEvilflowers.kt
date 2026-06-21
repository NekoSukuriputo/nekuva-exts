package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("READER_EVILFLOWERS", "EvilFlowers", "en")
internal class ReaderEvilflowers(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READER_EVILFLOWERS, "evilflowers.com", pageSize = 10) {
	override val listUrl = "project/"
}
