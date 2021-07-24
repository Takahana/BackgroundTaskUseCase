package tech.takahana.backgroundtaskusecase.feature.main.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
  private val uiConstraintFactory: MainUiConstraint.Factory
) : ViewModel() {

  val uiConstraint: MainUiConstraint by lazy {
    uiConstraintFactory.create(viewModelScope)
  }
}