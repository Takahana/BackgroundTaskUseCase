package tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.R
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint.UiEvent

@AndroidEntryPoint
class RunWhenFragmentClosedFragment : Fragment(R.layout.fragment_run_when_fragment_closed) {
  private val viewModel: RunWhenFragmentClosedViewModel by viewModels()
  private val uiConstraint: RunWhenFragmentClosedFragmentUiConstraint by lazy {
    viewModel.uiConstraint
  }

  override fun onDestroyView() {
    super.onDestroyView()
    uiConstraint.processEvent(UiEvent.ClosedScreen)
  }
}