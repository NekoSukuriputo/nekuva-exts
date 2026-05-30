package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("NIVERAFANSUB", "NiveraFansub", "tr", ContentType.HENTAI)
internal class NiveraFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIVERAFANSUB, "niverafansub.org") {
	override val datePattern = "d MMMM yyyy"
}
