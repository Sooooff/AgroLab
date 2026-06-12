// settings.gradle.kts

// Habilita la característica para que los catálogos sean visibles
//enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        // Define aquí los plugins con sus versiones desde libs.versions.toml
        id("com.android.application") version "8.10.1" // Añade esta línea
        kotlin("android") version "2.0.21" // Cambia "jvm" a "android"
    }
}

// El resto del archivo no necesita cambios...
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    //lineas claves para los catalogos
    //versionCatalogs {
      //  create("libs") {
    //        //withoutDefaultLibraries()
    //        from(files("libs.versions.toml"))
    //    }
    //}

}

rootProject.name = "AgroLab"
include(":app")
