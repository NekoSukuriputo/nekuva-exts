package org.dokiteam.doki.parsers.site.all.mangafire

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_EN", "MangaFire English", "en")
internal class MangaFireEn(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_EN, "en")
