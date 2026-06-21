package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("KAKUSEIPROJECT", "KakuseiProject", "pt")
internal class KakuseiProject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KAKUSEIPROJECT, "kakuseiproject.com", 10)
