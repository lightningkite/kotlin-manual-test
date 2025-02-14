package com.lightningkite.testing.manual

import kotlinx.datetime.Instant
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.test.assertEquals

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

// assertManualReview("SomeFile.kt", "fawue3ahfasdfawe", "fjiwejifiof2ji2",
// assertManualReview(file = "SomeFile.kt", reviewedHash = "fawue3ahfasdfawe", "fjiwejifiof2ji2",
// Change to the file 2