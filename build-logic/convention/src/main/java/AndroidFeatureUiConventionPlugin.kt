import lin.yufan.convention.addUiLayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureUiConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("thorun.android.library.compose")

            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}