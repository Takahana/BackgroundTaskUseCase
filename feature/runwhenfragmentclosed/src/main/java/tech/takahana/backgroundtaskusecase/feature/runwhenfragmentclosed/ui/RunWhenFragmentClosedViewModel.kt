package tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint
import javax.inject.Inject

@HiltViewModel
class RunWhenFragmentClosedViewModel @Inject constructor(
  private val uiConstraintFactory: RunWhenFragmentClosedFragmentUiConstraint.Factory
) : ViewModel() {

  val uiConstraint: RunWhenFragmentClosedFragmentUiConstraint by lazy {
    uiConstraintFactory.create(viewModelScope)
  }
}