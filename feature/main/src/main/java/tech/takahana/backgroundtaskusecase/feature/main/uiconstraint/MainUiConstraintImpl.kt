package tech.takahana.backgroundtaskusecase.feature.main.uiconstraint

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineScope
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint

class MainUiConstraintImpl @AssistedInject constructor(
  @Assisted private val viewModelScoped: CoroutineScope
) : MainUiConstraint {

  @AssistedFactory
  interface Factory : MainUiConstraint.Factory {
    override fun create(@Assisted viewModelScope: CoroutineScope): MainUiConstraintImpl
  }

  override fun processEvent(event: MainUiConstraint.UiEvent) {
  }
}