package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("DOUJINSHELL", "DoujinShell", "es", ContentType.HENTAI)
internal class DoujinShell(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJINSHELL, "www.doujinshell.com", 10) {
	override val datePattern = "dd MMMM, yyyy"
	override val listUrl = "doujin/"
	override val tagPrefix = "doujin-genero/"
	override val selectPage = "img:not(.aligncenter)"
}
