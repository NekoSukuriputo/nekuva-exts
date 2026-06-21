package org.nekosukuriputo.nekuva.parsers.site.gallery.zh

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterOptions
import org.nekosukuriputo.nekuva.parsers.site.gallery.GalleryParser

@MangaSourceParser("XIUTAKU", "Xiutaku", "zh", type = ContentType.OTHER)
internal class Xiutaku(context: MangaLoaderContext) :
    GalleryParser(context, MangaParserSource.XIUTAKU, "xiutaku.com") {

    override suspend fun getFilterOptions(): MangaListFilterOptions =
		MangaListFilterOptions(availableTags = fetchTags())
}
