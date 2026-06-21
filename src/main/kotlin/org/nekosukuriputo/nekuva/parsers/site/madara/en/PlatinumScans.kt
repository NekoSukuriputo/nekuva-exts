package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("PLATINUMSCANS", "PlatinumScans", "en")
internal class PlatinumScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PLATINUMSCANS, "platinumscans.com", pageSize = 10) {
	override val postReq = true
}
