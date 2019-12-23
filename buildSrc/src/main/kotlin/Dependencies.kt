import org.gradle.api.JavaVersion

/**
 * Configuração da aplicação
 * */
object Config {

    val MIN_SDK = 23
    val COMPILE_SDK = 29
    val TARGET_SDK = 29
    val JAVA_VERSION = JavaVersion.VERSION_1_8
    val BUILD_TOOLS = "29.0.2"
}

/**
 * Versionamento das bilbiotecas comnuns da aplicação.
 * */
object Versions {
    /*
    * Google Libraries
    * */
    val ANDROIDX_CORE = "1.1.0"
    val ANDROIDX_RECYCLER_VIEW = "1.0.0"
    val ANDROIDX_NAVIGATION = "2.0.0"
    val ANDROIDX_CONSTRAINT_LAYOUT = "1.1.3"
    val MATERIAL_DESIGN = "1.2.0-alpha02"
    val APP_COMPAT = "1.1.0"

    /*
    * Test Libraries
    * */
    val JUNIT = "4.12"
    val ANDROIDX_ESPRESSO = "3.1.0"
    val ANDROIDX_TESTING = "1.1.1"

    /*
    * Tools Libraries
    * */
    val GRADLE_ANDROID = "3.5.3"
    val KOTLIN = "1.3.61"
    val GRADLE_VERSION = "0.21.0"


    /*
    * Others Libraries
    * */
    val LOTTIE_API = "3.3.1"
}

object Dependencies {
    val androidx_core = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
    val androidx_constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.ANDROIDX_CONSTRAINT_LAYOUT}"
    val androidx_material = "com.google.android.material:material:${Versions.MATERIAL_DESIGN}"
    val androidx_navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.ANDROIDX_NAVIGATION}"
    val androidx_navigation_ui =
        "androidx.navigation:navigation-ui-ktx:${Versions.ANDROIDX_NAVIGATION}"
    val androidx_recyclerview =
        "androidx.recyclerview:recyclerview:${Versions.ANDROIDX_RECYCLER_VIEW}"

    val testlib_junit = "junit:junit:${Versions.JUNIT}"

    val testandroidx_rules = "androidx.test:rules:${Versions.ANDROIDX_TESTING}"
    val testandroidx_runner = "androidx.test:runner:${Versions.ANDROIDX_TESTING}"
    val testandroidx_espressocore =
        "androidx.test.espresso:espresso-core:${Versions.ANDROIDX_ESPRESSO}"

    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.GRADLE_ANDROID}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"

    val lottie_api = "com.airbnb.android:lottie:${Versions.LOTTIE_API}"

    val app_compat = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

}

