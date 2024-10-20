import com.android.build.api.dsl.LibraryExtension
import lin.yufan.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("thorun.android.library")

            val extension = extensions.getByType<LibraryExtension>()

            configureAndroidCompose(extension)
        }
    }
}