package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Blocked by Cloudflare")
@MangaSourceParser("EPSILONSCAN", "EpsilonScan", "fr", ContentType.HENTAI)
internal class EpsilonscanParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EPSILONSCAN, "epsilonscan.to") {
	override val datePattern = "dd/MM/yy"
	override val withoutAjax = true
}
