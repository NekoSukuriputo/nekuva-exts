package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("NOVELSTOWN", "NovelsTown", "ar")
internal class Novelstown(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOVELSTOWN, "novelstown.com") {
	override val datePattern = "d MMMM، yyyy"
}
