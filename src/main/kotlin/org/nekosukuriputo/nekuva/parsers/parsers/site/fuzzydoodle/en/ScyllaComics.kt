package org.nekosukuriputo.nekuva.parsers.site.fuzzydoodle.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterOptions
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.fuzzydoodle.FuzzyDoodleParser
import java.util.EnumSet

@MangaSourceParser("SCYLLACOMICS", "ScyllaComics", "en")
internal class ScyllaComics(context: MangaLoaderContext) :
	FuzzyDoodleParser(context, MangaParserSource.SCYLLACOMICS, "scyllacomics.xyz") {

	override suspend fun getFilterOptions() = MangaListFilterOptions(
		availableContentTypes = EnumSet.of(
			ContentType.MANGA,
			ContentType.MANHWA,
			ContentType.MANHUA,
		),
	)
}
