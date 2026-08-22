package org.nekosukuriputo.nekuva.parsers

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.nekosukuriputo.nekuva.parsers.site.id.DoujinDesuParser

class TestGenresApi {
    @Test
    fun testGenres() = runBlocking {
        val parser = DoujinDesuParser(MangaLoaderContextMock)
        val options = parser.getFilterOptions()
        println(options.availableTags.joinToString { it.title })
    }
}