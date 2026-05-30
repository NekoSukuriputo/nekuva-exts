package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("COPYPASTESCAN", "CopyPasteScan", "es")
internal class Copypastescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COPYPASTESCAN, "copypastescan.xyz", 10) {
	override val datePattern = "d MMMM, yyyy"
}
