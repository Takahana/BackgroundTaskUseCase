package tech.takahana.backgroundtaskusecase.shared.feature.ui.theme.theme

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

fun AppThemeComposeView(context: Context, content: @Composable () -> Unit): ComposeView {
  return ComposeView(context = context).apply {
    setContent {
      BackgroundTaskUseCaseTheme {
        content()
      }
    }
  }
}