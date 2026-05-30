package org.nekosukuriputo.nekuva.parsers.site.madara.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("YUBIKIRI", "Yubikiri", "id")
internal class Yubikiri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YUBIKIRI, "yubikiri.my.id", 18) {
	override val tagPrefix = "genre/"
	override val datePattern = "d MMMM"
}
