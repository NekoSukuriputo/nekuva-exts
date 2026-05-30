package org.nekosukuriputo.nekuva.parsers.site.hotcomics.de

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.hotcomics.HotComicsParser
import java.util.Locale

@Broken
@MangaSourceParser("TOOMICS", "Toomics", "de")
internal class Toomics(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICS, "toomics.top/de") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isSearchSupported = false
}
