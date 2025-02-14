package com.lightningkite.testing.manual

import kotlin.test.Test

class BasicTest {
    @Test
    fun test() {
        assertManualReview(
            file = "commonMain/kotlin/Main.kt",
            currentHash = "cf2e8806521a60fdbda49ab5845fa580be6ecd6c",
            reviewedHash = "cf2e8806521a60fdbda49ab5845fa580be6ecd6c",
            whatToTest = """
                Just that it works, right here.
            """.trimIndent()
        )
    }
}