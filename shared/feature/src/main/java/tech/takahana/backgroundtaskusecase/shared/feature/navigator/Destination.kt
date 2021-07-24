package tech.takahana.backgroundtaskusecase.shared.feature.navigator

sealed class Destination {

  object MainDestination {
    object RunWhenFragmentClosed : Destination()
  }
}