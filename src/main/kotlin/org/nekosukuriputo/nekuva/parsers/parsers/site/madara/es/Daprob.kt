package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("DAPROB", "Daprob", "es")
internal class Daprob(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DAPROB, "daprob.com") {
	override val datePattern = "d 'de' MMMMM 'de' yyyy"
}
