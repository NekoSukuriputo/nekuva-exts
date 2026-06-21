package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("INMORALNOFANSUB", "InmoralNoFansub", "es")
internal class InmoralNoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INMORALNOFANSUB, "inmoralnofansub.xyz") {
	override val datePattern = "dd/MM/yyyy"
}
