package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("HIPERCOOL", "Hipercool", "pt", ContentType.HENTAI)
internal class Hipercool(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HIPERCOOL, "hiper.cool", pageSize = 20) {
	override val tagPrefix = "manga-tag/"
}
