plugins {
    id("com.android.application")
    id("kotlin-android")
}

apply(from = rootProject.file("android_config.gradle"))

dependencies {

    implementation(projects.feature.main)
    implementation(projects.shared.resource)
}
