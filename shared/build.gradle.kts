plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    androidTarget()
    jvm()

    sourceSets {
        commonMain.dependencies {
            // shared multiplatform dependencies
        }
        androidMain.dependencies {
            // android-specific dependencies
        }
    }
}

android {
    namespace = "com.santanuapi.testUI.shared"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
}