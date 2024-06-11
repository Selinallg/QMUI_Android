// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.qmuiteam.plugin.Dep
buildscript {
    repositories {

//        mavenCentral()
//        google()
//        mavenLocal()

        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
//        maven("https://jitpack.io")
//
//        google()
//        mavenCentral()
//        maven("https://repo1.maven.org/maven2/")

//        maven { url 'https://repo1.maven.org/maven2/' }
//        maven { url 'https://maven.aliyun.com/repository/jcenter' }
//        maven { url 'https://maven.aliyun.com/repository/google' }
//        maven { url 'https://maven.aliyun.com/repository/central' }
//        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }

        // JitPack 远程仓库：https://jitpack.io
//        maven { url 'https://jitpack.io' }




    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
    }

}

plugins {
    id("qmui-dep")
//    id("com.osacky.doctor") version "0.8.0"
}

subprojects {
    group = Dep.QMUI.group
}

allprojects {
    repositories {
//        maven { url 'https://maven.aliyun.com/repository/jcenter' }
//        maven { url 'https://maven.aliyun.com/repository/google' }
//        maven { url 'https://maven.aliyun.com/repository/central' }
//        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
//        mavenCentral()
//        google()
//        mavenLocal()

        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
//        maven("https://repo1.maven.org/maven2/")
//        maven("https://jitpack.io")


//        google()
//        mavenCentral()

    }
}
