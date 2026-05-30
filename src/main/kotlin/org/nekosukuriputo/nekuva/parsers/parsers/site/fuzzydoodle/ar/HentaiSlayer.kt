package org.nekosukuriputo.nekuva.parsers.site.fuzzydoodle.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.MangaState
import org.nekosukuriputo.nekuva.parsers.site.fuzzydoodle.FuzzyDoodleParser
import java.util.*

@MangaSourceParser("HENTAISLAYER", "HentaiSlayer", "ar", ContentType.HENTAI)
internal class HentaiSlayer(context: MangaLoaderContext) :
	FuzzyDoodleParser(context, MangaParserSource.HENTAISLAYER, "hentaislayer.net") {

	override val ongoingValue = "مستمر"
	override val finishedValue = "مكتمل"
	override val abandonedValue = "متوقف"

	override val mangaValue = "مانجا"
	override val manhuaValue = "مانهوا"
	override val comicsValue = "كوميكس"

	override suspend fun getFilterOptions() = super.getFilterOptions().copy(
		availableStates = EnumSet.of(MangaState.ONGOING, MangaState.FINISHED, MangaState.ABANDONED),
		availableContentTypes = EnumSet.of(
			ContentType.MANGA,
			ContentType.MANHUA,
			ContentType.COMICS,
		),
	)
}
