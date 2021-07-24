package tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraint

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineScope
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint.UiEvent

class RunWhenFragmentClosedFragmentUiConstraintImpl @AssistedInject constructor(
  @Assisted private val viewModelScoped: CoroutineScope
) : RunWhenFragmentClosedFragmentUiConstraint {

  @AssistedFactory
  interface Factory : RunWhenFragmentClosedFragmentUiConstraint.Factory {
    override fun create(@Assisted viewModelScope: CoroutineScope): RunWhenFragmentClosedFragmentUiConstraintImpl
  }

  override fun processEvent(event: UiEvent) {
  }
}