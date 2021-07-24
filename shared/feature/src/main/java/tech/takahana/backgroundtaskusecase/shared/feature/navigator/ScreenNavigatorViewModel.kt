package tech.takahana.backgroundtaskusecase.shared.feature.navigator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.SharedFlow
import tech.takahana.backgroundtaskusecase.shared.feature.uiconstraint.singleEffectFlow

class ScreenNavigatorViewModel : ViewModel() {
  private val _destinationEffect = singleEffectFlow<Destination>()
  val destinationEffect: SharedFlow<Destination> = _destinationEffect

  fun navigate(destination: Destination) {
    _destinationEffect.tryEmit(destination)
  }
}