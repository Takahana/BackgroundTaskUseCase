package tech.takahana.backgroundtaskusecase.feature.main.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import tech.takahana.backgroundtaskusecase.feature.main.R
import tech.takahana.backgroundtaskusecase.shared.feature.navigator.Destination
import tech.takahana.backgroundtaskusecase.shared.feature.navigator.Destination.MainDestination
import tech.takahana.backgroundtaskusecase.shared.feature.navigator.ScreenNavigatorViewModel
import javax.annotation.meta.Exhaustive

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

  private val screenNavigatorViewModel: ScreenNavigatorViewModel by viewModels()
  private val navController: NavController get() = findNavController(R.id.nav_host_fragment)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    collectDestinationEffect()
  }

  private fun collectDestinationEffect() {
    lifecycleScope.launch {
      lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
        screenNavigatorViewModel.destinationEffect.collect { destination ->
          navigate(destination)
        }
      }
    }
  }

  private fun navigate(destination: Destination) {
    @Exhaustive
    when (destination) {
      MainDestination.RunWhenFragmentClosed -> {
        navController.navigate(R.id.action_mainFragment_to_runWhenFragmentClosedFragment)
      }
    }
  }
}
