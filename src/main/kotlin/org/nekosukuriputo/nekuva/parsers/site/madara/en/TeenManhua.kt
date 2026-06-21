package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain parked — landing page only, no manga content")
@MangaSourceParser("TEENMANHUA", "TeenManhua", "en")
internal class TeenManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TEENMANHUA, "teenmanhua.com") {
	override val datePattern = "dd/MM/yyyy"
}
