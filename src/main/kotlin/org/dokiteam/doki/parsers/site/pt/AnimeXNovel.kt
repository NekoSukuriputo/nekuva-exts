package org.dokiteam.doki.parsers.site.pt

import okhttp3.Headers
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.json.JSONArray
import org.dokiteam.doki.parsers.Broken
import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.core.PagedMangaParser
import org.dokiteam.doki.parsers.exception.ParseException
import org.dokiteam.doki.parsers.model.Manga
import org.dokiteam.doki.parsers.model.MangaChapter
import org.dokiteam.doki.parsers.model.MangaListFilter
import org.dokiteam.doki.parsers.model.MangaListFilterCapabilities
import org.dokiteam.doki.parsers.model.MangaListFilterOptions
import org.dokiteam.doki.parsers.model.MangaPage
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.model.RATING_UNKNOWN
import org.dokiteam.doki.parsers.model.SortOrder
import org.dokiteam.doki.parsers.util.attrAsRelativeUrl
import org.dokiteam.doki.parsers.util.generateUid
import org.dokiteam.doki.parsers.util.parseHtml
import org.dokiteam.doki.parsers.util.parseJson
import org.dokiteam.doki.parsers.util.parseSafe
import org.dokiteam.doki.parsers.util.src
import org.dokiteam.doki.parsers.util.toAbsoluteUrl
import org.dokiteam.doki.parsers.util.toRelativeUrl
import org.dokiteam.doki.parsers.util.urlEncoded
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.EnumSet
import java.util.Locale

@Broken("Need to refactor fetchChaptersApi function")
@MangaSourceParser("ANIMEXNOVEL", "AnimeXNovel", "pt")
internal class AnimeXNovel(context: MangaLoaderContext) :
    PagedMangaParser(context, MangaParserSource.ANIMEXNOVEL, 24) {

    override val configKeyDomain = ConfigKey.Domain("animexnovel.com")

    override val availableSortOrders: Set<SortOrder> = EnumSet.of(
		SortOrder.UPDATED,
		SortOrder.POPULARITY,
	)

    override val filterCapabilities: MangaListFilterCapabilities
        get() = MangaListFilterCapabilities(
            isSearchSupported = true,
        )

    override suspend fun getFilterOptions() = MangaListFilterOptions()

    // ---------------------------------------------------------------
    // 1. List / Search (Hybrid: HTML for Popular, AJAX for Search)
    // ---------------------------------------------------------------
    override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
        return if (!filter.query.isNullOrEmpty()) {
            searchManga(filter.query)
        } else {
            // Popular/Latest from HTML
            val endpoint = if (order == SortOrder.POPULARITY) "/mangas" else "/"
            val url = "https://$domain$endpoint".toHttpUrl()

            val selector = if (order == SortOrder.POPULARITY) {
                ".eael-post-grid-container article"
            } else {
                "div:contains(Últimos Mangás) + div .manga-card"
            }

            val doc = webClient.httpGet(url).parseHtml()
            doc.select(selector).mapNotNull { element ->
                val link = element.selectFirst("a") ?: return@mapNotNull null
                val href = link.attrAsRelativeUrl("href")
                Manga(
                    id = generateUid(href),
                    title = element.selectFirst("h2, h3, .search-content")?.text() ?: "Unknown",
                    altTitles = emptySet(),
                    url = href,
                    publicUrl = href.toAbsoluteUrl(domain),
                    rating = RATING_UNKNOWN,
                    contentRating = null,
                    coverUrl = element.selectFirst("img")?.src(),
                    tags = emptySet(),
                    state = null,
                    authors = emptySet(),
                    source = source,
                )
            }
        }
    }

    private suspend fun searchManga(query: String): List<Manga> {
        val url = "https://$domain/wp-admin/admin-ajax.php".toHttpUrl()
        val payload = "action=newscrunch_live_search&keyword=${query.urlEncoded()}"

        // FIX 2: Construct headers manually
        val searchHeaders = Headers.Builder()
            .add("Content-Type", "application/x-www-form-urlencoded")
            .build()

        val doc = webClient.httpPost(
            url = url,
            payload = payload,
            extraHeaders = searchHeaders
        ).parseHtml()

        return doc.select(".search-wrapper").mapNotNull { element ->
            val link = element.selectFirst("a") ?: return@mapNotNull null
            var href = link.attrAsRelativeUrl("href")

            if (href.contains("capitulo")) {
                href = href.substringBeforeLast("capitulo")
            }

            val rawTitle = element.selectFirst(".search-content")?.text() ?: "Unknown"
            val title = rawTitle.replace(Regex("""[-–][^-–]*$"""), "").trim()

            Manga(
                id = generateUid(href),
                title = title,
                altTitles = emptySet(),
                url = href,
                publicUrl = href.toAbsoluteUrl(domain),
                rating = RATING_UNKNOWN,
                contentRating = null,
                coverUrl = element.selectFirst("img")?.src(),
                tags = emptySet(),
                state = null,
                authors = emptySet(),
                source = source,
            )
        }.distinctBy { it.url }
    }

    // ---------------------------------------------------------------
    // 2. Details
    // ---------------------------------------------------------------
    override suspend fun getDetails(manga: Manga): Manga {
        val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()

        val author = doc.selectFirst("li:contains(Autor:)")?.text()?.substringAfter(":")?.trim()
        val artist = doc.selectFirst("li:contains(Arte:)")?.text()?.substringAfter(":")?.trim()
        val description = doc.selectFirst("meta[itemprop='description']")?.attr("content")

        val categoryId = doc.selectFirst("#container-capitulos")?.attr("data-categoria")
            ?: throw ParseException("Could not find category ID for chapters", manga.url)

        val chapters = fetchChaptersApi(categoryId)

        return manga.copy(
            title = doc.selectFirst("h2.spnc-entry-title")?.text() ?: manga.title,
            authors = setOfNotNull(author, artist),
            description = description,
            chapters = chapters,
            tags = emptySet()
        )
    }

    // ---------------------------------------------------------------
    // 3. Chapters
    // ---------------------------------------------------------------
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ROOT)

    private suspend fun fetchChaptersApi(categoryId: String): List<MangaChapter> {
        val allChapters = ArrayList<MangaChapter>()
        var page = 1

        while (true) {
            val apiUrl = "https://$domain/wp-json/wp/v2/posts".toHttpUrl().newBuilder()
                .addQueryParameter("categories", categoryId)
                .addQueryParameter("orderby", "date")
                .addQueryParameter("order", "desc")
                .addQueryParameter("per_page", "100")
                .addQueryParameter("page", page.toString())
                .build()

            val response = try {
                webClient.httpGet(apiUrl).parseJson()
            } catch (_: Exception) {
                break
            }

            if (response !is JSONArray) break
            if (response.length() == 0) break

            for (i in 0 until response.length()) {
                val item = response.getJSONObject(i)
                val link = item.getString("link").toRelativeUrl(domain)

                if (!link.contains("capitulo")) continue

                val titleObj = item.getJSONObject("title")
                val rawTitle = titleObj.getString("rendered")
                val cleanTitle = rawTitle.substringAfter(";").takeIf { it.isNotBlank() } ?: rawTitle

                val dateStr = item.optString("date").take(10)

                val slug = item.optString("slug")
                val number = Regex("""(\d+(\.\d+)?)""").findAll(slug).lastOrNull()?.value?.toFloatOrNull() ?: 0f

                allChapters.add(
                    MangaChapter(
                        id = generateUid(link),
                        title = cleanTitle,
                        number = number,
                        volume = 0,
                        url = link,
                        scanlator = null,
                        uploadDate = dateFormat.parseSafe(dateStr),
                        branch = null,
                        source = source
                    )
                )
            }
            page++
        }

        return allChapters
    }

    // ---------------------------------------------------------------
    // 4. Pages
    // ---------------------------------------------------------------
    override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
        val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()

        val container = doc.selectFirst(".spice-block-img-gallery, .wp-block-gallery, .spnc-entry-content")
            ?: throw ParseException("Page container not found", chapter.url)

        return container.select("img").map { img ->
            val url = img.src() ?: img.attr("data-src")
            MangaPage(
                id = generateUid(url),
                url = url,
                preview = null,
                source = source
            )
        }
    }
}
