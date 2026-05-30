package org.nekosukuriputo.nekuva.parsers.site.all.bato

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.all.BatoParser

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
