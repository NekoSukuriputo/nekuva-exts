package org.nekosukuriputo.nekuva.parsers.exception

import okio.IOException
import org.nekosukuriputo.nekuva.parsers.InternalParsersApi
import org.nekosukuriputo.nekuva.parsers.model.MangaSource

/**
 * Authorization is required for access to the requested content
 */
public class AuthRequiredException @InternalParsersApi @JvmOverloads constructor(
	public val source: MangaSource,
	cause: Throwable? = null,
) : IOException("Authorization required", cause)
