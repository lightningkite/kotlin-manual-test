plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:2.1.0")
}
kotlin {
    jvmToolchain(17)
}
file("../kotlin-test-manual-plugin/src/main/kotlin/KotlinTestManualPlugin.kt")
    .copyTo(file("src/main/kotlin/KotlinTestManualPlugin.kt"), overwrite = true)