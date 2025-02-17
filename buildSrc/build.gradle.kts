plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
}
dependencies {
}
kotlin {
    jvmToolchain(17)
}
file("../kotlin-test-manual-plugin/src/main/kotlin/KotlinTestManualPlugin.kt")
    .copyTo(file("src/main/kotlin/KotlinTestManualPlugin.kt"), overwrite = true)