package org.nekosukuriputo.nekuva.parsers.site.cupfox.vi

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.cupfox.CupFoxParser

@Broken
@MangaSourceParser("OIOIVN", "OioiVn", "vi")
internal class OioiVn(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.OIOIVN, "oioivn.com")
