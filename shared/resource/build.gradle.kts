plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = rootProject.file("android_config.gradle"))

dependencies {

    implementation(libs.material.core)
}