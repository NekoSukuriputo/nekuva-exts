package org.dokiteam.doki.parsers.site.all.mangafire

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_ES", "MangaFire Spanish", "es")
internal class MangaFireEs(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_ES, "es")
