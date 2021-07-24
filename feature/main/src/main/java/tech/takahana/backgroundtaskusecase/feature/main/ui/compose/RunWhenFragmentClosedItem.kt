package tech.takahana.backgroundtaskusecase.feature.main.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.takahana.backgroundtaskusecase.shared.resource.R as ResR

@Composable
fun RunWhenFragmentClosedItem(
  toRunWhenFragmentClosed: () -> Unit
) {
  Column(
    modifier = Modifier
      .clickable { toRunWhenFragmentClosed() }
      .fillMaxWidth()
      .padding(16.dp)
  ) {
    Text(
      text = stringResource(id = ResR.string.main_run_when_fragment_closed_title),
      style = MaterialTheme.typography.h6
    )
  }
}

@Preview
@Composable
fun PreviewRunWhenFragmentClosedItem() {
  RunWhenFragmentClosedItem(
    toRunWhenFragmentClosed = {}
  )
}