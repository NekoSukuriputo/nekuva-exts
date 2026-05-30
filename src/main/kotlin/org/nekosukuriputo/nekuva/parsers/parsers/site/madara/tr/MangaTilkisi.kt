package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATILKISI", "MangaTilkisi", "tr")
internal class MangaTilkisi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATILKISI, "www.mangatilkisi.net", pageSize = 18) {
	override val datePattern = "dd/MM/yyyy"
  }
