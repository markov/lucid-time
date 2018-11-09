plugins {
    kotlin("jvm")
    `maven-publish`
    id("org.jetbrains.dokka") version "0.9.17"
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.12")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputFormat = "javadoc"
    outputDirectory = "$buildDir/javadoc"
}

val javadocJar by tasks.registering(Jar::class) {
    classifier = "javadoc"
    from(dokka)
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar.get())
            artifact(javadocJar.get())
            pom {
                url.set("https://github.com/markov/lucid-time")
                scm {
                    url.set("https://github.com/markov/lucid-time")
                    connection.set("scm:git:git://github.com/markov/lucid-time.git")
                    developerConnection.set("scm:git:ssh://git@github.com/markov/lucid-time.git")
                }
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("markov")
                        name.set("Gesh Markov")
                    }
                }
            }
        }
    }
}
