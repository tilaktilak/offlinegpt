pluginManagement {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
        maven ( uri("https://artifactory.appodeal.com/appodeal-beta-public") )
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven ( uri("https://artifactory.appodeal.com/appodeal-beta-public") )
    }
}

rootProject.name = "LLM Inference"
include(":app")
