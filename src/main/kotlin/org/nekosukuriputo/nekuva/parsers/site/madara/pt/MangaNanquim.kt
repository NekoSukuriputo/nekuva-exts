package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite")
@MangaSourceParser("MANGANANQUIM", "MangaNanquim", "pt")
internal class MangaNanquim(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGANANQUIM, "mangananquim.site", 10) {
	override val datePattern: String = "d 'de' MMMM 'de' yyyy"
	override val listUrl = "ler-manga/"
	override val tagPrefix = "manga-genero/"
}
