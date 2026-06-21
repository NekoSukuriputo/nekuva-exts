package org.nekosukuriputo.nekuva.parsers.site.pizzareader.it

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("HASTATEAM", "HastaTeamDdt", "it")
internal class HastaTeam(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.HASTATEAM, "ddt.hastateam.com")
