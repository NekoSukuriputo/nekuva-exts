package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken // Host error
@MangaSourceParser("STICKHORSE", "StickHorse", "es")
internal class Stickhorse(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.STICKHORSE, "www.stickhorse.cl") {
	override val postReq = true
}
