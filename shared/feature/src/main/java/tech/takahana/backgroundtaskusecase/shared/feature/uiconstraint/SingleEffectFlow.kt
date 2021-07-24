package tech.takahana.backgroundtaskusecase.shared.feature.uiconstraint

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow

fun <T> singleEffectFlow() = MutableSharedFlow<T>(0, 1, BufferOverflow.DROP_OLDEST)