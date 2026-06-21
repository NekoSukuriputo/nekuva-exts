package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken ("Not dead, changed template")
@MangaSourceParser("MANGASORIGINESUNOFFICIAL", "CrunchyScan", "fr")
internal class MangasOriginesUnofficial(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASORIGINESUNOFFICIAL, "crunchyscan.fr")
