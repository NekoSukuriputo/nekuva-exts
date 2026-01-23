package org.dokiteam.doki.parsers.site.manhwaz.vi

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.ContentType
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.manhwaz.ManhwaZ

@MangaSourceParser("SAYHENTAI", "SayHentai", "vi", ContentType.HENTAI)
internal class SayHentai(context: MangaLoaderContext) :
	ManhwaZ(context, MangaParserSource.SAYHENTAI, "sayhentai.live")
