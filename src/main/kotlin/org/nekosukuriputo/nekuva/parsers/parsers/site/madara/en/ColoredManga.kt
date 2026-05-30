package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("COLORED_MANGA", "ColoredManga", "en")
internal class ColoredManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COLORED_MANGA, "coloredmanga.net") {
	override val datePattern = "dd-MMM"
}
