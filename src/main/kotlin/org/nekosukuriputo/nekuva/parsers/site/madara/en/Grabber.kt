package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("GRABBER", "Grabber", "en", ContentType.COMICS)
internal class Grabber(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GRABBER, "grabber.zone", 20) {
	override val tagPrefix = "type/"
	override val listUrl = "comics/"
	override val datePattern = "dd.MM.yyyy"
}
