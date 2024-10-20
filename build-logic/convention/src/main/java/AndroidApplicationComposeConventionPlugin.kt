import com.android.build.api.dsl.ApplicationExtension
import lin.yufan.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("thorun.android.application")

            val extension = extensions.getByType<ApplicationExtension>()

            configureAndroidCompose(extension)
        }
    }
}