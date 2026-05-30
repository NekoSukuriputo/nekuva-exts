package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ANSHSCANS", "AnshScans", "en")
internal class AnshScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANSHSCANS, "anshscans.org", 10) {
	override val tagPrefix = "genre/"
	override val datePattern = "MMMM dd, yyyy"
}
