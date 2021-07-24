plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("dagger.hilt.android.plugin")
}

apply(from = rootProject.file("android_config.gradle"))

dependencies {

  implementation(libs.hilt.android.core)
  kapt(libs.hilt.android.compiler)

  implementation(projects.shared.compose)
  implementation(projects.shared.feature)
  implementation(projects.shared.resource)
}
