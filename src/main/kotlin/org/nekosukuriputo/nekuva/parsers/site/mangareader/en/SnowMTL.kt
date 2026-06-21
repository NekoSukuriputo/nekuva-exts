package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SNOWMACHINETRANSLATION", "Snow Machine Translation", "en")

internal class SnowMachineTranslation(context: MangaLoaderContext) :
    MangaReaderParser(
        context,
        MangaParserSource.SNOWMACHINETRANSLATION,
        "snowmachinetranslation.com",
        pageSize = 24,
        searchPageSize = 10
    ) {
        override val listUrl = "/manga"
}
