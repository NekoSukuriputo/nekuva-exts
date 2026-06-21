package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SLEEPYTRANSLATIONS", "Sleepy Translations", "en")
internal class SleepyTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SLEEPYTRANSLATIONS, "sleepytranslations.com", 16) {
	override val listUrl = "series/"
	override val tagPrefix = "genre/"
}
