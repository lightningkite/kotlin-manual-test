package com.lightningkite.testing.manual

import kotlinx.datetime.Instant
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.test.assertEquals

/**
 * Throws if the file changes until the [reviewedHash] is updated.
 * WARNING: For this to work, you can't put comments in the function call or rearrange the arguments!
 * The preprocessor would miss the declaration and wouldn't update it.
 * [file] The suffix of the file to check the hash of.  If this is vague, the pre-processor will warn you.
 */
public fun assertManualReview(
    file: String,
    currentHash: String = "",
    reviewedHash: String = "",
    whatToTest: String = ""
) {
    assertEquals(reviewedHash, currentHash, """
        --- Manual Testing and Review Required of $file ---
         You need to review changes to $file.  Here's what you need to test or check:
         $whatToTest
    """.trimIndent())
}
