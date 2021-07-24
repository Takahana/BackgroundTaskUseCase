package tech.takahana.backgroundtaskusecase.feature.main.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(
  toRunWhenFragmentClosed: () -> Unit
) {
  Column {
    RunWhenFragmentClosedItem(
      toRunWhenFragmentClosed = toRunWhenFragmentClosed
    )
  }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun PreviewMainScreen() {
  MainScreen(
    toRunWhenFragmentClosed = {}
  )
}