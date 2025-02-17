import com.lightningkite.testing.manual.assertManualReview
import org.junit.Test

class EnsureManualReviewTest {
    @Test
    fun test() {
        assertManualReview(
            file = "KotlinTestManualPlugin.kt",
            currentHash = "48d75a4839ba4e308738d18c5fea68ab15556251",
            reviewedHash = "48d75a4839ba4e308738d18c5fea68ab15556251",
            whatToTest = """
                We haven't written tests for this yet.  As such, you need to ensure the following:
                - Comments and whitespace are ignored when determining the hash
                - Vague file references (filename could reference more than one file) throw
            """.trimIndent()
        )
    }
}