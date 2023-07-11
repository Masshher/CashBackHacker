plugins {
    id("java")
}

group = "ru.netolodgy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.testng:testng:7.1.0"))
}

tasks.test {
    useTestNG()
}