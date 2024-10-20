plugins {
    `kotlin-dsl`
}

group = "lin.yufan.thorun.buildlogic"

dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "thorun.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}

