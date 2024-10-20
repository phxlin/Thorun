plugins {
    alias(libs.plugins.compose.compiler)

    alias(libs.plugins.thorun.android.library.compose)
}

android {
    namespace = "lin.yufan.core.presentation.ui"
}

dependencies {

    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(projects.core.presentation.designsystem)

    implementation(projects.core.domain)
}