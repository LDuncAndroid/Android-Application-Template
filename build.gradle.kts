buildscript {
    val kotlinVersion by project.extra("1.5.10")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

repositories {
    google()
    mavenCentral()
}

allprojects {
    apply {
        val kotlinVersion by extra("1.5.10")
    }
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("delete") {
    delete(rootProject.buildDir)
}