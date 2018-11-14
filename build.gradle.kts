plugins {
    kotlin("jvm") version "1.3.10" apply false
}

subprojects {
    repositories {
        mavenCentral()
    }

    group = "eu.markov.kotlin.lucidtime"
    version = "2.0.0"
}
