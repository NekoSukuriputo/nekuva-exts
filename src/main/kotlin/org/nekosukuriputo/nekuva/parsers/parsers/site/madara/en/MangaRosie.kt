package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAROSIE", "Toon69", "en")
internal class MangaRosie(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROSIE, "toon69.com", pageSize = 16) {
	override val datePattern = "MMMM dd, yyyy"
}
