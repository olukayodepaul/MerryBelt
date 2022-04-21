package dependencies

import dependencies.Versions.hilt_lifecycle_viewmodel

object Dependencies {

    //Hilt Component
    const val hilt_viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${hilt_lifecycle_viewmodel}"
    const val hilt_viewModel_kapt = "androidx.hilt:hilt-compiler:$hilt_lifecycle_viewmodel"
    const val hilt_dagger = "com.google.dagger:hilt-android:${Versions.hilt_dagger_version}"

    //Kotlin Standard Library
    const val kotlin_standard_library = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val isKtx = "androidx.core:core-ktx:${Versions.ktx}"

    //Coroutines Component
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}"

    //Notification badge
    const val notificationBadge = "com.nex3z:notification-badge:${Versions.badge}"

    //Lifecycle components
    const val lifecycle_common = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    const val lifecycle_liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle_version}"
    const val life_cycle_extension = "androidx.lifecycle:lifecycle-extensions:${Versions.life_cycle_extension_version}"
    const val androidxActivity = "androidx.activity:activity-ktx:${Versions.androidxActivity}"

    //google current location serveice
    const val googlelocationservice = "com.google.android.gms:play-services-location:${Versions.locationservice}"

    //Retrofit and OKHttp
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2_version}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2_version}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp_version}"
    const val okhttplogging = "com.squareup.okhttp3:logging-interceptor:${Versions.httpinterceptor_version}"

    //view Pager
    const val swipeViewPager =  "androidx.viewpager2:viewpager2:${Versions.swipeViewPager}"
    const val circleIndicator = "me.relex:circleindicator:${Versions.circleIndicator}"
}