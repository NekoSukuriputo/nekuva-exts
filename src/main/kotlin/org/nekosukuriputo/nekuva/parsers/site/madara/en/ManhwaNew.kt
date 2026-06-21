package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Site is gone — root redirects to an unrelated domain")
@MangaSourceParser("MANHWANEW", "ManhwaNew", "en")
internal class ManhwaNew(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWANEW, "manhwanew.com") {
	override val datePattern = "MM/dd/yyyy"
}
