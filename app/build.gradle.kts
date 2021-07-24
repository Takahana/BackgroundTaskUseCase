plugins {
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
  id("dagger.hilt.android.plugin")
}

apply(from = rootProject.file("android_config_no_compose.gradle"))

dependencies {

  implementation(libs.hilt.android.core)
  kapt(libs.hilt.android.compiler)

  implementation(projects.feature.main)
  implementation(projects.feature.runwhenfragmentclosed)
  implementation(projects.shared.feature)
  implementation(projects.shared.resource)
}
