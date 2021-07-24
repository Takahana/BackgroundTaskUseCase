package tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface

import kotlinx.coroutines.CoroutineScope

interface RunWhenFragmentClosedFragmentUiConstraint {

  interface Factory {
    fun create(viewModelScope: CoroutineScope): RunWhenFragmentClosedFragmentUiConstraint
  }

  sealed class UiEvent {
    object ClosedScreen : UiEvent()
  }

  fun processEvent(event: UiEvent)
}