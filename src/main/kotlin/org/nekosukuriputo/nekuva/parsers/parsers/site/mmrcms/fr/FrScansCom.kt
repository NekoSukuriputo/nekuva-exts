package org.nekosukuriputo.nekuva.parsers.site.mmrcms.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("FRSCANSCOM", "FrScans.com", "fr")
internal class FrScansCom(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.FRSCANSCOM, "frscans.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
