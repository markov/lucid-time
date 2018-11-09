plugins {
    kotlin("jvm") version "1.3.0" apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    group = "eu.markov.kotlin.lucidtime"
    version = "1.0.0"
}
