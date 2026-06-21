package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ASURASCANSTR", "AsuraScansTR", "tr")
internal class AsuraScansTR(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASURASCANSTR, "asurascans.com.tr") {
	override val tagPrefix = "tur/"
}
