package org.nekosukuriputo.nekuva.parsers.exception

import org.nekosukuriputo.nekuva.parsers.InternalParsersApi

public class ParseException @InternalParsersApi @JvmOverloads constructor(
	public val shortMessage: String?,
	public val url: String,
	cause: Throwable? = null,
) : RuntimeException("$shortMessage at $url", cause)
