package org.dokiteam.doki.parsers.site.all.bato

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.BatoParser

@MangaSourceParser("XBATCAT", "XBatCat")
internal class XBatCatParser(context: MangaLoaderContext):
	BatoParser(context, MangaParserSource.XBATCAT, "xbat.si") {

	override val configKeyDomain = ConfigKey.Domain(
		"xbat.si",
		"xbat.tv",
	)
}
