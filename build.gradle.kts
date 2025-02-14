
group = "com.lightningkite.testing"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        mavenLocal()
        maven("https://lightningkite-maven.s3.us-west-2.amazonaws.com")
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.lightningkite:lk-gradle-helpers:1.0.8")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:2.1.0")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:2.0.0")
        classpath("com.android.tools.build:gradle:8.5.2")
    }
}
allprojects {
    group = "com.lightningkite.testing"
    repositories {
        mavenLocal()
        maven("https://lightningkite-maven.s3.us-west-2.amazonaws.com")
        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}
repositories {
    mavenLocal()
    maven("https://lightningkite-maven.s3.us-west-2.amazonaws.com")
    maven("https://jitpack.io")
    google()
    mavenCentral()
}