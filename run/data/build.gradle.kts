plugins {
    alias(libs.plugins.thorun.android.library)
}

android {
    namespace = "lin.yufan.run.data"
}

dependencies {

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.core.database)
    implementation(projects.core.domain)

    implementation(projects.run.domain)
}