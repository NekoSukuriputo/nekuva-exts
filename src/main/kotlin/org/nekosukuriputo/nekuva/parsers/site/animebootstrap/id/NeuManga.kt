package org.nekosukuriputo.nekuva.parsers.site.animebootstrap.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.animebootstrap.AnimeBootstrapParser

@MangaSourceParser("NEUMANGA", "NeuManga.xyz", "id")
internal class NeuManga(context: MangaLoaderContext) :
	AnimeBootstrapParser(context, MangaParserSource.NEUMANGA, "neumanga.xyz")
