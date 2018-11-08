plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.12")
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).all {
    kotlinOptions.freeCompilerArgs += "-XXLanguage:+InlineClasses"
}