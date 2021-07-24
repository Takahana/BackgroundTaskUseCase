package tech.takahana.backgroundtaskusecase.feature.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import tech.takahana.backgroundtaskusecase.feature.main.ui.compose.MainScreen
import tech.takahana.backgroundtaskusecase.shared.feature.ui.theme.theme.AppThemeComposeView

@AndroidEntryPoint
class MainFragment : Fragment() {

  private val viewModel: MainViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return AppThemeComposeView(requireContext()) {
      MainScreen()
    }
  }
}