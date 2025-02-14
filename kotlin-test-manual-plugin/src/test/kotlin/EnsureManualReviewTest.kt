import com.lightningkite.testing.manual.assertManualReview
import org.junit.Test

class EnsureManualReviewTest {
    @Test
    fun test() {
        assertManualReview(
            file = "KotlinTestManualPlugin.kt",
            currentHash = "84990f41362886f80cf945119412d295deb24cd4",
            reviewedHash = "84990f41362886f80cf945119412d295deb24cd4",
            whatToTest = """
                We haven't written tests for this yet.  As such, you need to ensure the following:
                - Comments and whitespace are ignored when determining the hash
                - Vague file references (filename could reference more than one file) throw
            """.trimIndent()
        )
    }
}