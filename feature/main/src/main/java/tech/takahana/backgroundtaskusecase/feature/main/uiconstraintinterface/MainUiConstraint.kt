package tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface

import kotlinx.coroutines.CoroutineScope

interface MainUiConstraint {

  interface Factory {
    fun create(viewModelScope: CoroutineScope): MainUiConstraint
  }

  sealed class UiEvent {
    object ClickRunWhenFragmentClosed : UiEvent()
  }

  fun processEvent(event: UiEvent)
}