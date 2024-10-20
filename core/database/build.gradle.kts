plugins {
    alias(libs.plugins.thorun.android.library)
}

android {
    namespace = "lin.yufan.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}