// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.com_android_tools_build_gradle)
        classpath(Libs.kotlin_gradle_plugin)
        classpath("com.android.tools.build:gradle:4.1.1")
    }
}
plugins {
    buildSrcVersions
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}
