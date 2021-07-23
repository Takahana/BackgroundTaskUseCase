plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = rootProject.file("android_config.gradle"))

dependencies {

    api(libs.androidx.core)
    api(libs.androidx.appcompat)
    api(libs.material.core)
    api(libs.bundles.test.local)
    api(libs.androidx.constraintlayout)
}