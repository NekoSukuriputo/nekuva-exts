package org.nekosukuriputo.nekuva.parsers.site.mmrcms.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("MANGA_SCAN", "MangaScan", "fr")
internal class MangaScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.MANGA_SCAN, "mangascan-fr.net") {
	override val imgUpdated = ".jpg"
	override val sourceLocale: Locale = Locale.ENGLISH
}
