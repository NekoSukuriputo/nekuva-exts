package org.nekosukuriputo.nekuva.parsers.site.natsu.ja

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.natsu.NatsuParser

@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
    NatsuParser(context, MangaParserSource.RAWKUMA, 24) {
    override val configKeyDomain = ConfigKey.Domain("rawkuma.net")
}
