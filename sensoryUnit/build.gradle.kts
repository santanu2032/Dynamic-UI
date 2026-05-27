plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.android.lint)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

kotlin {

    android {
        namespace = "com.sensoryunit"
        compileSdk {
            version = release(36) { minorApiLevel = 1 }
        }
        minSdk = 31

        withHostTestBuilder {}
        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }.configure {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    // ── iOS ───────────────────────────────────────────────────────────
    val xcfName = "sensoryUnitKit"
    iosX64            { binaries.framework { baseName = xcfName } }
    iosArm64          { binaries.framework { baseName = xcfName } }
    iosSimulatorArm64 { binaries.framework { baseName = xcfName } }

    // ── Desktop / Windows ─────────────────────────────────────────────
    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
        }
    }

    // ── Source Sets ───────────────────────────────────────────────────
    sourceSets {

        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)

                // ── Compose Multiplatform (shared UI) ─────────────
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation(compose.components.resources)
            }
        }

        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }

        androidMain {
            dependencies {
                // Compose Android extras
                implementation(compose.uiTooling)
                implementation(compose.preview)
            }
        }

        getByName("androidDeviceTest") {
            dependencies {
                implementation(libs.androidx.core)
                implementation(libs.androidx.junit)
                implementation(libs.androidx.runner)
            }
        }

        iosMain {
            dependencies {
                // iOS Compose is handled by commonMain automatically
            }
        }

        val desktopMain by getting {
            dependencies {
                // Compose Desktop renderer
                implementation(compose.desktop.currentOs)

                // javax.sound.sampled auto-available — no extra dep
            }
        }
    }
}