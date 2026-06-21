package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Blocked by Cloudflare challenge")
@MangaSourceParser("RAGNAROKSCAN", "RagnarokScan", "es")
internal class RagnarokScan(context: MangaLoaderContext) :
    MadaraParser(context, MangaParserSource.RAGNAROKSCAN, "ragnarokscan.com") {
    override val stylePage = ""
    override val listUrl = "series/"
    override val tagPrefix = "genero/"
}
