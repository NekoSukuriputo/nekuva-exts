package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGASPARK", "Manga-Spark", "ar")
internal class Mangaspark(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASPARK, "manga-spark.com", pageSize = 10) {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
}
