package tech.takahana.backgroundtaskusecase.feature.main.uiconstraint

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineScope
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint.UiEffect
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint.UiEvent
import tech.takahana.backgroundtaskusecase.shared.feature.uiconstraint.singleEffectFlow
import javax.annotation.meta.Exhaustive

class MainUiConstraintImpl @AssistedInject constructor(
  @Assisted private val viewModelScoped: CoroutineScope
) : MainUiConstraint {

  @AssistedFactory
  interface Factory : MainUiConstraint.Factory {
    override fun create(@Assisted viewModelScope: CoroutineScope): MainUiConstraintImpl
  }

  override val uiEffect = singleEffectFlow<MainUiConstraint.UiEffect>()

  override fun processEvent(event: UiEvent) {
    @Exhaustive
    when (event) {
      is UiEvent.ClickRunWhenFragmentClosed -> clickRunWhenFragmentClosed(event)
    }
  }

  private fun clickRunWhenFragmentClosed(event: UiEvent.ClickRunWhenFragmentClosed) {
    uiEffect.tryEmit(UiEffect.NavToRunWhenFragmentClosed)
  }
}
