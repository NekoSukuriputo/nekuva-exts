package org.dokiteam.doki.parsers.site.all.mangafire

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_JA", "MangaFire Japanese", "ja")
internal class MangaFireJa(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_JA, "ja")
