package org.nekosukuriputo.nekuva.parsers.site.vmp.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.vmp.VmpParser

// Other domain name : toonx.net
@MangaSourceParser("VERCOMICSPORNO", "VerComicsPorno", "es", ContentType.HENTAI)
internal class VerComicsPorno(context: MangaLoaderContext) :
	VmpParser(context, MangaParserSource.VERCOMICSPORNO, "vercomicsporno.com") {
	override val listUrl = "comics-porno/"
	override val geneUrl = "etiquetas/"
}
