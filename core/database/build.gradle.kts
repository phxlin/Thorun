plugins {
    alias(libs.plugins.thorun.android.library)
    alias(libs.plugins.thorun.android.room)
}

android {
    namespace = "lin.yufan.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}