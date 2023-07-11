plugins {
    id("java")
}

group = "ru.netolodgy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("junit:junit:4.13"))
    testImplementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnit()
}