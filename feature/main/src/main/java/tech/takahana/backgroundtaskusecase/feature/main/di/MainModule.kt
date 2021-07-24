package tech.takahana.backgroundtaskusecase.feature.main.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraint.MainUiConstraintImpl
import tech.takahana.backgroundtaskusecase.feature.main.uiconstraintinterface.MainUiConstraint

@Module
@InstallIn(ViewModelComponent::class)
interface MainModule {

  @Binds
  fun bindMainUiConstraintFactory(
    factory: MainUiConstraintImpl.Factory
  ): MainUiConstraint.Factory
}