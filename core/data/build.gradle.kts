plugins {
    alias(libs.plugins.thorun.android.library)
    alias(libs.plugins.thorun.jvm.ktor)
}

android {
    namespace = "lin.yufan.core.data"
}

dependencies {

    implementation(libs.timber)

    implementation(projects.core.database)

    implementation(projects.core.domain)
}