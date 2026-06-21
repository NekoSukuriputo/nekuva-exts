package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Website is down!")
@MangaSourceParser("HENTAITECA", "Hentaiteca", "pt", ContentType.HENTAI)
internal class Hentaiteca(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAITECA, "hentaiteca.net", pageSize = 10) {
	override val datePattern = "MM/dd/yyyy"
	override val tagPrefix = "genero/"
}
