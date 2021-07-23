plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = rootProject.file("android_config.gradle"))

dependencies {
    api(libs.bundles.compose)
    api(libs.bundles.accompanist)
}
