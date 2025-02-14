import com.lightningkite.deployhelpers.*
import com.lightningkite.testing.manual.KotlinTestManualPlugin
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    signing
    id("com.vanniktech.maven.publish") version "0.30.0"
    id("org.jetbrains.dokka")
}
apply<KotlinTestManualPlugin>()

gradlePlugin {
    plugins {
        create("lightningkite-testing-manual") {
            id = "com.lightningkite.testing.manual"
            implementationClass = "com.lightningkite.testing.manual.KotlinTestManualPlugin"
        }
    }
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:2.1.0")
    testImplementation(project(":runtime"))
    testImplementation("junit:junit:4.13.2")
}
tasks.validatePlugins {
    enableStricterValidation.set(true)
}

val lk = project.lk {
    version = gitBasedVersion().also { println("Determined version to be $it") }
}
mavenPublishing {
    signAllPublications()
    coordinates(group.toString(), name, version.toString())
    pom {
        name.set("Testing-Gradle-Plugin")
        description.set("Automatically create your routers")
        github("lightningkite", "kotlin-test-manual")

        licenses {
            mit()
        }

        developers {
            joseph()
            brady()
        }
    }
}

tasks.create("publishLocally", Copy::class.java) {
    group = "publishing"
    from(file("src/main/kotlin/KotlinTestManualPlugin.kt"))
    into(rootProject.file("buildSrc/src/main/kotlin"))
}
