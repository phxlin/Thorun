plugins {
    alias(libs.plugins.thorun.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}