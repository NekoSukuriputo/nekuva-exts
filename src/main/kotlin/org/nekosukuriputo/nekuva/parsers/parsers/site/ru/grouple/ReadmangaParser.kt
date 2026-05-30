package org.nekosukuriputo.nekuva.parsers.site.ru.grouple

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource

@MangaSourceParser("READMANGA_RU", "ReadManga", "ru")
internal class ReadmangaParser(
    context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.READMANGA_RU, 1) {

    override val configKeyDomain = ConfigKey.Domain(*domains)

    override fun getRequestHeaders() = super.getRequestHeaders().newBuilder()
        .add("referer", "https://$domain/")
        .build()

    companion object {

        val domains = arrayOf(
            "a.zazaza.me",
            "3.readmanga.ru",
        )
    }
}
