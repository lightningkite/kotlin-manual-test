package com.lightningkite.testing.manual

import kotlin.test.Test

class BasicTest {
    @Test
    fun test() {
        assertManualReview(
            file = "Main.kt",
            currentHash = "37db443d0364da6977630b6b1e9f84a27f426f7e",
            reviewedHash = "37db443d0364da6977630b6b1e9f84a27f426f7e",
            whatToTest = """
                Just that it works, right here.
            """.trimIndent()
        )
    }
}