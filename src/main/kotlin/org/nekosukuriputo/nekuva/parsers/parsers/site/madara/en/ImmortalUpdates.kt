package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Redirect to @MortalsGroove")
@MangaSourceParser("IMMORTALUPDATES", "ImmortalUpdates", "en")
internal class ImmortalUpdates(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMMORTALUPDATES, "immortalupdates.com") {
	override val listUrl = "mangas/"
}
