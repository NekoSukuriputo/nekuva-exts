package org.nekosukuriputo.nekuva.parsers
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilter
import org.nekosukuriputo.nekuva.parsers.model.SortOrder
import org.nekosukuriputo.nekuva.parsers.site.id.DoujinDesuParser
import org.nekosukuriputo.nekuva.test_util.*
import kotlin.time.Duration.Companion.minutes
class TestPage2 {
    @Test
    fun testPage2() = runTest(timeout = 2.minutes) {
        val parser = DoujinDesuParser(MangaLoaderContextMock)
        val list1 = parser.getList(0, SortOrder.NEWEST, MangaListFilter.EMPTY)
        println("Page 1 offset 0 items: ${list1.size}")
        val list2 = parser.getList(24, SortOrder.NEWEST, MangaListFilter.EMPTY)
        println("Page 2 offset 24 items: ${list2.size}")
    }
}
