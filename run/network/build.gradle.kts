plugins {
    alias(libs.plugins.thorun.android.library)
    alias(libs.plugins.thorun.jvm.ktor)
}

android {
    namespace = "lin.yufan.run.network"
}

dependencies {

    implementation(projects.core.data)

    implementation(projects.core.domain)
}