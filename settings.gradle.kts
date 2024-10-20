pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Thorun"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")

include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:presentation:designsystem")
include(":core:presentation:ui")

include(":auth:data")
include(":auth:domain")
include(":auth:presentation")

include(":run:data")
include(":run:domain")
include(":run:presentation")
include(":run:location")
include(":run:network")
