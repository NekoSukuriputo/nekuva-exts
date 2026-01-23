package org.dokiteam.doki.parsers.site.natsu.ja

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.natsu.NatsuParser

@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
    NatsuParser(context, MangaParserSource.RAWKUMA, 24) {
    override val configKeyDomain = ConfigKey.Domain("rawkuma.net")
}
