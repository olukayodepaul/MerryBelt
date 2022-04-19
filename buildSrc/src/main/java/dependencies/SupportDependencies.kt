package dependencies

object SupportDependencies {

    //Support Dependencies
    const val isSupportAndroidxAppCompact = "androidx.appcompat:appcompat:${Versions.androidxAppCompactAndGoogleMaterialDesign}"
    const val isSupportGoogleMaterialDesign = "com.google.android.material:material:${Versions.androidxAppCompactAndGoogleMaterialDesign}"
    const val isSupportAndroidxConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val isSwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
    const val recycler_view = "androidx.recyclerview:recyclerview:${Versions.recycle_view_version}"
    const val glides = "com.github.bumptech.glide:glide:${Versions.glide_version}"
    const val glide_github = "com.github.bumptech.glide:compiler:${Versions.glide_version}"
    const val sharePrefence = "androidx.datastore:datastore-preferences:${Versions.preference}"
    const val materialDialog = "com.afollestad.material-dialogs:core:${Versions.matieral_dialogs_version}"

    //Testing Dependencies
    const val isSupportJUnitTesting = "junit:junit:${Versions.junitTest}"
    const val isSupportExtensionTesting = "androidx.test.ext:junit:${Versions.unitExtension}"
    const val isSupportEspressoTesting = "androidx.test.espresso:espresso-core:${Versions.espressoTesting}"


}