package org.nekosukuriputo.nekuva.parsers.site.pizzareader.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.SortOrder
import org.nekosukuriputo.nekuva.parsers.site.pizzareader.PizzaReaderParser
import java.util.EnumSet

@MangaSourceParser("FMTEAM", "FmTeam", "fr")
internal class FmTeam(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.FMTEAM, "fmteam.fr") {
	override val availableSortOrders: Set<SortOrder> = EnumSet.of(
		SortOrder.ALPHABETICAL,
		SortOrder.UPDATED,
		SortOrder.UPDATED_ASC,
	)
	override val ongoingFilter = "en cours"
	override val completedFilter = "terminé"
}
