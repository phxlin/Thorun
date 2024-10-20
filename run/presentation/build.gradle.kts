plugins {
    alias(libs.plugins.compose.compiler)

    alias(libs.plugins.thorun.android.feature.ui)
}

android {
    namespace = "lin.yufan.run.presentation"
}

dependencies {

    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.core.domain)

    implementation(projects.run.domain)
}