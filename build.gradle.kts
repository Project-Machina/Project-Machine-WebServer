plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.web"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.6.10")
    implementation("io.ktor:ktor-server-core:2.0.0-beta-1")
    implementation("io.ktor:ktor-server-netty:2.0.0-beta-1")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.0-beta-1")
    implementation("io.ktor:ktor-server-content-negotiation:2.0.0-beta-1")
}