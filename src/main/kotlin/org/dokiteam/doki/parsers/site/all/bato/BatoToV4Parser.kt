package org.dokiteam.doki.parsers.site.all.bato

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.BatoParser

@MangaSourceParser("BATOTOV4", "Bato.To v4")
internal class BatoToV4Parser(context: MangaLoaderContext):
	BatoParser(context, MangaParserSource.BATOTOV4, "bato.si") {

	override val configKeyDomain = ConfigKey.Domain(
		"bato.si",
		"battwo.com",
		"bato.to",
		"bato.ing",
	)
}
