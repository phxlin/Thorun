plugins {
    alias(libs.plugins.thorun.android.library)
}

android {
    namespace = "lin.yufan.run.network"
}

dependencies {

    implementation(projects.core.data)

    implementation(projects.core.domain)
}