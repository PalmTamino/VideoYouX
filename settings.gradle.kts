pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/public")
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/public")
    }
    versionCatalogs {
        create("libs") {
            library(
                "viewBing-ktx", "com.github.DylanCaiCoding.ViewBindingKTX:viewbinding-ktx:2.1.0"
            )
            library(
                "viewBing-base", "com.github.DylanCaiCoding.ViewBindingKTX:viewbinding-base:2.1.0"
            )
            library("androidx-palette", "androidx.palette:palette:1.0.0")
            library("monet-compat", "com.github.KieronQuinn:MonetCompat:0.4.1")
        }
    }
}
rootProject.name = "VideoYouX"
include(":app")
