package org.nekosukuriputo.nekuva.parsers.site.id

import okhttp3.Headers
import org.json.JSONArray
import org.json.JSONObject
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.core.PagedMangaParser
import org.nekosukuriputo.nekuva.parsers.model.*
import org.nekosukuriputo.nekuva.parsers.network.CommonHeaders
import org.nekosukuriputo.nekuva.parsers.util.*
import java.net.URLDecoder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

@MangaSourceParser("DOUJINDESU", "DoujinDesu", "id", ContentType.HENTAI)
internal class DoujinDesuParser(context: MangaLoaderContext) :
	PagedMangaParser(context, MangaParserSource.DOUJINDESU, pageSize = 24) {

	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("doujin.desu.xxx")

	override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
		super.onCreateConfig(keys)
		keys.add(userAgentKey)
	}

	override val availableSortOrders: Set<SortOrder>
		get() = EnumSet.of(
			SortOrder.UPDATED,
			SortOrder.NEWEST,
			SortOrder.NEWEST_ASC,
			SortOrder.RATING,
			SortOrder.ALPHABETICAL
		)

	override val filterCapabilities: MangaListFilterCapabilities
		get() = MangaListFilterCapabilities(
			isMultipleTagsSupported = false,
			isSearchSupported = true,
			isSearchWithFiltersSupported = false,
			isAuthorSearchSupported = false,
		)

	override suspend fun getFilterOptions() = MangaListFilterOptions(
		availableTags = fetchAvailableTags(),
		availableStates = EnumSet.of(
			MangaState.ONGOING,
			MangaState.FINISHED,
			MangaState.PAUSED,
		),
		availableContentTypes = EnumSet.of(
			ContentType.MANGA,
			ContentType.MANHWA,
			ContentType.DOUJINSHI,
		),
	)

	private val API_SECRET = "dfdf72051dbfdc7d76889ebd31324e74"
	private val FRE = "doujindesu-scrapers-cannot-read-this-super-secret-salt-2026-v2"
	private val MRE = 3600000L // 36e5

	private fun wH(e: Long): String {
		val t = "${FRE}_$e"
		var a = 0
		for (d in t.indices) {
			a = (a shl 5) - a + t[d].code
		}
		val i = java.lang.StringBuilder()
		var l = abs(a.toLong())
		if (l == 0L) l = 123456789L
		for (d in 0 until 32) {
			l = (l * 1664525L + 1013904223L) % 4294967296L
			i.append((33 + (l % 93)).toInt().toChar())
		}
		return i.toString()
	}

	private fun getKeys(): List<String> {
		val e = System.currentTimeMillis()
		val t = e / MRE
		val keys = mutableListOf<String>()
		for (j in -2..2) {
			keys.add(wH(t + j))
		}
		return keys
	}

	private fun yre(e: String, t: String): String {
		val a = mutableListOf<Int>()
		var u = 0
		while (u < e.length) {
			if (u + 2 > e.length) break
			val p = e.substring(u, u + 2)
			a.add(p.toInt(16))
			u += 2
		}
		val i = java.lang.StringBuilder()
		val l = t.length
		var d = 42
		for (index in a.indices) {
			val p = a[index]
			val f = t[index % l].code
			val k = p xor f xor (index * 13) xor d
			i.append((k and 255).toChar())
			d = (d + p) % 256
		}
		return i.toString()
	}

	private fun decryptPayload(payload: String): String {
		for (key in getKeys()) {
			try {
				val dec = yre(payload, key)
				if (dec.startsWith("%5B") || dec.startsWith("%7B")) {
					return URLDecoder.decode(dec, "UTF-8")
				}
			} catch (e: Exception) {
				// ignore and try next key
			}
		}
		throw Exception("Failed to decrypt DoujinDesu API payload")
	}

	override fun getRequestHeaders(): Headers = Headers.Builder()
		.add(CommonHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
		.add(CommonHeaders.X_REQUESTED_WITH, "XMLHttpRequest")
		.add("X-App-Secret", API_SECRET)
		.add(CommonHeaders.REFERER, "https://$domain/explore")
		.add(CommonHeaders.ACCEPT, "application/json, text/plain, */*")
		.build()

	override suspend fun getListPage(page: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		val url = urlBuilder().apply {
			addPathSegment("api")
			addPathSegment("manga")

			// Pagination logic based on offset
			val offset = (page - 1) * pageSize
			addQueryParameter("offset", offset.toString())
			addQueryParameter("limit", pageSize.toString())

			if (!filter.query.isNullOrBlank()) {
				addQueryParameter("search", filter.query)
			}

			// Content Type filter
			if (filter.types.isNotEmpty()) {
				val typeStr = when (filter.types.first()) {
					ContentType.MANGA -> "manga"
					ContentType.MANHWA -> "manhwa"
					ContentType.DOUJINSHI -> "doujinshi"
					else -> ""
				}
				if (typeStr.isNotEmpty()) addQueryParameter("type", typeStr)
			}

			// Genres filter
			if (filter.tags.isNotEmpty()) {
				addQueryParameter("genre", filter.tags.joinToString(",") { it.key })
			}

			// Status filter
			if (filter.states.isNotEmpty()) {
				val statusStr = when (filter.states.first()) {
					MangaState.ONGOING -> "ongoing"
					MangaState.FINISHED -> "completed"
					MangaState.PAUSED -> "hiatus"
					else -> ""
				}
				if (statusStr.isNotEmpty()) addQueryParameter("status", statusStr)
			}

			// Sort order
			val sortStr = when (order) {
				SortOrder.UPDATED -> "latest_chapter"
				SortOrder.NEWEST -> "newest"
				SortOrder.NEWEST_ASC -> "oldest"
				SortOrder.RATING -> "rating"
				SortOrder.ALPHABETICAL -> "title_asc"
				else -> "newest"
			}
			addQueryParameter("sort", sortStr)
		}.build()

		val jsonResponse = webClient.httpGet(url).parseJson()
		val encryptedPayload = jsonResponse.getString("_enc_resp_")
		val decryptedStr = decryptPayload(encryptedPayload)
		val jsonArray = JSONArray(decryptedStr)

		return (0 until jsonArray.length()).map { i ->
			val item = jsonArray.getJSONObject(i)
			val slug = item.getString("slug")
			val coverUrl = item.optString("cover_url", "")
			val title = item.getString("title")

			Manga(
				id = generateUid(slug),
				title = title,
				altTitles = emptySet(),
				url = "/$slug",
				publicUrl = "https://$domain/manga/$slug",
				rating = (item.optDouble("rating", 0.0) / 10.0).toFloat(),
				contentRating = ContentRating.ADULT,
				coverUrl = coverUrl.ifBlank { null },
				tags = emptySet(),
				state = when (item.optString("status")) {
					"ongoing" -> MangaState.ONGOING
					"completed" -> MangaState.FINISHED
					else -> null
				},
				authors = emptySet(),
				largeCoverUrl = null,
				description = null,
				source = source,
			)
		}
	}

	override suspend fun getDetails(manga: Manga): Manga {
		val decodedUrl = java.net.URLDecoder.decode(manga.url, "UTF-8")
		val slug = decodedUrl.trim('/').substringAfterLast("/")
		val url = urlBuilder().apply {
			addPathSegment("api")
			addPathSegment("manga")
			addPathSegment(slug)
		}.build()

		val jsonResponse = webClient.httpGet(url).parseJson()
		val encryptedPayload = jsonResponse.getString("_enc_resp_")
		val decryptedStr = decryptPayload(encryptedPayload)
		val item = JSONObject(decryptedStr)

		val chapters = item.optJSONArray("chapters")?.let { chaptersArray ->
			(0 until chaptersArray.length()).map { i ->
				val chapObj = chaptersArray.getJSONObject(i)
				val chapId = chapObj.getString("id")
				val chapNumber = chapObj.optDouble("chapter_number", 0.0).toFloat()
				val uploadDateStr = chapObj.optString("created_at")
				val uploadDate = try {
					val cleanDateStr = uploadDateStr.substringBefore(".")
					SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).apply {
						timeZone = TimeZone.getTimeZone("UTC")
					}.parse(cleanDateStr)?.time ?: 0L
				} catch (e: Exception) {
					0L
				}

				MangaChapter(
					id = generateUid(chapId),
					title = chapObj.optString("title", "Chapter $chapNumber"),
					number = chapNumber,
					volume = 0,
					url = "/$chapId",
					scanlator = null,
					uploadDate = uploadDate,
					branch = null,
					source = source
				)
			}.reversed()
		} ?: emptyList()

		val tags = item.optJSONArray("manga_genres")?.let { genresArray ->
			(0 until genresArray.length()).mapNotNull { j ->
				val genreObj = genresArray.optJSONObject(j)?.optJSONObject("genres")
				genreObj?.optString("name")?.let { name ->
					MangaTag(
						key = genreObj.optString("slug", name),
						title = name,
						source = source
					)
				}
			}
		}?.toSet() ?: emptySet()

		val authors = mutableSetOf<String>()
		val termListStr = item.optString("term_list", "")
		if (termListStr.isNotBlank()) {
			val terms = termListStr.split("|")
			for (term in terms) {
				val parts = term.split(":")
				if (parts.size == 3 && parts[1] == "author") {
					authors.add(parts[0])
				}
			}
		}

		val altTitlesStr = item.optString("alt_titles", "")
		val altTitles = if (altTitlesStr.isNotBlank()) {
			altTitlesStr.split("|").map { it.trim() }.toSet()
		} else emptySet()

		return manga.copy(
			description = item.optString("description"),
			state = when (item.optString("status")) {
				"ongoing" -> MangaState.ONGOING
				"completed" -> MangaState.FINISHED
				else -> null
			},
			rating = (item.optDouble("rating", 0.0) / 10.0).toFloat(),
			tags = tags,
			authors = authors,
			altTitles = altTitles,
			chapters = chapters
		)
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val chapterId = chapter.url.removePrefix("/")
		val url = urlBuilder().apply {
			addPathSegment("api")
			addPathSegment("chapters")
			addPathSegment(chapterId)
		}.build()

		val jsonResponse = webClient.httpGet(url).parseJson()
		val encryptedPayload = jsonResponse.getString("_enc_resp_")
		val decryptedStr = decryptPayload(encryptedPayload)
		val item = JSONObject(decryptedStr)

		val urls = item.optJSONArray("content_urls") ?: return emptyList()

		return (0 until urls.length()).map { i ->
			val pageUrl = urls.getString(i)
				.replace(" ", "%20")
				.replace("desu.photos/uploads/", "desu.photos/storage/uploads/")
			MangaPage(
				id = generateUid(pageUrl),
				url = pageUrl,
				preview = null,
				source = source
			)
		}
	}

	private suspend fun fetchAvailableTags(): Set<MangaTag> {
		val url = urlBuilder().apply {
			addPathSegment("api")
			addPathSegment("taxonomy")
			addPathSegment("genres")
			addQueryParameter("page", "1")
			addQueryParameter("limit", "500")
		}.build()

		val jsonResponse = webClient.httpGet(url).parseJson()
		val encryptedPayload = jsonResponse.getString("_enc_resp_")
		val decryptedStr = decryptPayload(encryptedPayload)
		val terms = JSONObject(decryptedStr).optJSONArray("terms") ?: return emptySet()

		return (0 until terms.length()).mapNotNull { i ->
			val genre = terms.optJSONObject(i) ?: return@mapNotNull null
			val name = genre.optString("name")
			val slug = genre.optString("slug", name)
			MangaTag(
				key = slug,
				title = name,
				source = source
			)
		}.toSet()
	}
}
