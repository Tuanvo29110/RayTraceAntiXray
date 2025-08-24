rootProject.name = "raytraceantixray"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven {
            name = "canvasmc"
            url = uri("https://maven.canvasmc.io/snapshots")
        }
    }
}
