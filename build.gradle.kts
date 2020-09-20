plugins {
    kotlin("jvm") version "1.3.61"
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.8"
}

javafx {
    // Declare the javafx modules we need to use
    version = "13.0.2"
    modules("javafx.controls", "javafx.base")
}

application {
    mainClassName = "de.deggers.application.ApplicationRunner"
    applicationDefaultJvmArgs = listOf(
        "--add-opens=javafx.graphics/javafx.scene=ALL-UNNAMED"
    )
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("no.tornado:tornadofx:2.0.0-SNAPSHOT")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "de.deggers.application.ApplicationRunner"
    }
}
tasks {
    test {
        useJUnitPlatform()
    }
}
