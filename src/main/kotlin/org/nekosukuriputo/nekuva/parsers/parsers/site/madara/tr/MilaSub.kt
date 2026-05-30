package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Content not found or removed")
@MangaSourceParser("MILASUB", "MilaSub", "tr")
internal class MilaSub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MILASUB, "milascans.tr", 20) {
	override val datePattern = "d MMMM yyyy"
}
