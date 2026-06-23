package org.nekosukuriputo.nekuva.parsers

import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilter
import org.nekosukuriputo.nekuva.parsers.model.SortOrder
import org.nekosukuriputo.nekuva.parsers.site.id.DoujinDesuParser
import org.nekosukuriputo.nekuva.test_util.*
import kotlin.time.Duration.Companion.minutes

class DoujinDesuLocalTest {
    @Test
    fun testDoujinDesu() = runTest(timeout = 2.minutes) {
        val parser = DoujinDesuParser(MangaLoaderContextMock)
        
        println("Testing getListPage...")
        val list = parser.getListPage(1, SortOrder.UPDATED, MangaListFilter.EMPTY)
        assert(list.isNotEmpty()) { "List is empty" }
        println("Found ${list.size} mangas. First: ${list.first().title}")

        val manga = list.first()
        println("Testing getDetails for ${manga.title}...")
        val details = parser.getDetails(manga)
        assert(details.chapters?.isNotEmpty() == true) { "Chapters is empty" }
        println("Found ${details.chapters?.size} chapters. First: ${details.chapters?.first()?.title}")

        val chapter = details.chapters!!.first()
        println("Testing getPages for ${chapter.title}...")
        val pages = parser.getPages(chapter)
        assert(pages.isNotEmpty()) { "Pages is empty" }
        println("Found ${pages.size} pages. First: ${pages.first().url}")
        
        println("SUCCESS!")
    }
}
