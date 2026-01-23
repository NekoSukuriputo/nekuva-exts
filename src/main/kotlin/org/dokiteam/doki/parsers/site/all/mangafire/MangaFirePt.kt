package org.dokiteam.doki.parsers.site.all.mangafire

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_PT", "MangaFire Portuguese", "pt")
internal class MangaFirePt(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_PT, "pt")
