plugins {
    alias(libs.plugins.compose.compiler)

    alias(libs.plugins.thorun.android.feature.ui)
}

android {
    namespace = "lin.yufan.auth.presentation"
}

dependencies {

    implementation(projects.core.domain)

    implementation(projects.auth.domain)
}