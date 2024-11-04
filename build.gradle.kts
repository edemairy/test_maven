/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        name = "ossrh"
        url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
        credentials {
            username = findProperty("ossrhUsername") ?: ""
            password = findProperty("ossrhPassword") ?: ""
        }
    }
}

group = "io.github.edemairy"
version = "0.0.1-SNAPSHOT"
description = "Maven core"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}