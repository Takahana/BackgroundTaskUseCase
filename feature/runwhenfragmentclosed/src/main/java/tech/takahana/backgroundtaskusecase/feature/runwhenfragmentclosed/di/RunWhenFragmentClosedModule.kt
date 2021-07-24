package tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraint.RunWhenFragmentClosedFragmentUiConstraintImpl
import tech.takahana.backgroundtaskusecase.feature.runwhenfragmentclosed.uiconstraintinterface.RunWhenFragmentClosedFragmentUiConstraint

@Module
@InstallIn(ViewModelComponent::class)
interface RunWhenFragmentClosedModule {

  @Binds
  fun bindRunWhenFragmentClosedUiConstraintFactory(
    factory: RunWhenFragmentClosedFragmentUiConstraintImpl.Factory
  ): RunWhenFragmentClosedFragmentUiConstraint.Factory
}