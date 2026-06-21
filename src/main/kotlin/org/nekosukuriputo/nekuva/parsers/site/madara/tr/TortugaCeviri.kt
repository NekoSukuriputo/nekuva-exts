package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("TORTUGACEVIRI", "TortugaCeviri", "tr")
internal class TortugaCeviri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TORTUGACEVIRI, "tortugaceviri.com")
