import com.lightningkite.deployhelpers.lk
import com.lightningkite.testing.manual.KotlinTestManualPlugin

plugins {
    kotlin("multiplatform")
    id("com.vanniktech.maven.publish") version "0.30.0"
}
apply<KotlinTestManualPlugin>()
buildscript {
    repositories {
        mavenLocal()
        maven("https://lightningkite-maven.s3.us-west-2.amazonaws.com")
    }
    dependencies {
        classpath("com.lightningkite:lk-gradle-helpers:1.1.1")
    }
}

val lk = lk {}

kotlin {
    jvmToolchain(17)
    explicitApi()
    jvm {
//        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
    }
    js(IR) {
        browser()
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    sourceSets {
        all {
            languageSettings.optIn("kotlinx.serialization.ExperimentalSerializationApi")
        }
        val commonMain by getting {
            dependencies {
                implementation(kotlin("test"))
                api(libs.kotlinXDatetime)
            }
            kotlin {
                srcDir(file("build/generated/ksp/common/commonMain/kotlin"))
            }
        }
        val commonTest by getting {
            dependencies {
            }
            kotlin {
                srcDir(file("build/generated/ksp/common/commonTest/kotlin"))
            }
        }
    }
}