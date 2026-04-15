@file:Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        // 阿里 Gradle 插件镜像
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        // 阿里公共仓库镜像 (包含 mavenCentral 和 jcenter)
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        // 阿里 Google 镜像
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/releases") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/releases/") }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        // 原版仓库 (作为备用)
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 阿里 Gradle 插件镜像
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        // 阿里公共仓库镜像 (包含 mavenCentral 和 jcenter)
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        // 阿里 Google 镜像
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/releases") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/releases/") }
        // 官方源
        google()
        mavenCentral()
        // JitPack 没有官方阿里镜像，通常还需要保留
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "JetpackMvvmDemo"
 include("app")
 include("JetpackMvvm")