package tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow

interface MainUiConstraint {

  interface Factory {
    fun create(viewModelScope: CoroutineScope): MainUiConstraint
  }

  sealed class UiEffect {
    object NavToRunWhenFragmentClosed : UiEffect()
  }

  sealed class UiEvent {
    object ClickRunWhenFragmentClosed : UiEvent()
  }

  val uiEffect: SharedFlow<UiEffect>

  fun processEvent(event: UiEvent)
}