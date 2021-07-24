package tech.takahana.backgroundtaskusecase.feature.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import tech.takahana.backgroundtaskusecase.feature.main.ui.compose.MainScreen
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint.UiEvent
import tech.takahana.backgroundtaskusecase.shared.feature.navigator.Destination.MainDestination
import tech.takahana.backgroundtaskusecase.shared.feature.navigator.ScreenNavigatorViewModel
import tech.takahana.backgroundtaskusecase.shared.feature.ui.theme.theme.AppThemeComposeView
import javax.annotation.meta.Exhaustive

@AndroidEntryPoint
class MainFragment : Fragment() {

  private val viewModel: MainViewModel by viewModels()
  private val screenNavigatorViewModel: ScreenNavigatorViewModel by activityViewModels()
  private val uiConstraint: MainUiConstraint by lazy { viewModel.uiConstraint }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return AppThemeComposeView(requireContext()) {
      MainScreen(
        toRunWhenFragmentClosed = { uiConstraint.processEvent(UiEvent.ClickRunWhenFragmentClosed) }
      )
    }
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    collectUiEffect()
  }

  private fun collectUiEffect() {
    lifecycleScope.launch {
      lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
        uiConstraint.uiEffect.collect { effect ->
          @Exhaustive
          when (effect) {
            MainUiConstraint.UiEffect.NavToRunWhenFragmentClosed -> {
              navigateToRunWhenFragmentClosed()
            }
          }
        }
      }
    }
  }

  private fun navigateToRunWhenFragmentClosed() {
    screenNavigatorViewModel.navigate(MainDestination.RunWhenFragmentClosed)
  }
}