package com.mobile.merrybelt.di


import com.mobile.merrybelt.datasource.RetrofitServices
import com.mobile.merrybelt.ui.profile.repository.ProfileRepo
import com.mobile.merrybelt.ui.profile.repository.ProfileRepoImpl
import com.mobile.merrybelt.ui.users.fragment.repository.UsersRepo
import com.mobile.merrybelt.ui.users.fragment.repository.UsersRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppRepository {

    @Singleton
    @Provides
    fun provideProfileRepository(
        networkCall: RetrofitServices
    ): ProfileRepo {
        return ProfileRepoImpl(
            networkCall
        )
    }

    @Singleton
    @Provides
    fun provideUsersRepository(
        networkCall: RetrofitServices
    ): UsersRepo {
        return UsersRepoImpl(
            networkCall
        )
    }

}