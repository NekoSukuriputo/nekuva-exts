package org.nekosukuriputo.nekuva.parsers.site.all.bato

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.all.BatoParser

@MangaSourceParser("XBATCAT", "XBatCat")
internal class XBatCatParser(context: MangaLoaderContext):
	BatoParser(context, MangaParserSource.XBATCAT, "xbat.si") {

	override val configKeyDomain = ConfigKey.Domain(
		"xbat.si",
		"xbat.tv",
	)
}
