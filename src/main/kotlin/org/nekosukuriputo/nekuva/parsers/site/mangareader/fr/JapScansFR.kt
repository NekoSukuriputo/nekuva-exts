package org.nekosukuriputo.nekuva.parsers.site.mangareader.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("JAPSCANSFR", "JapScans.fr", "fr")
internal class JapScansFR(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.JAPSCANSFR, "japscans.fr", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
