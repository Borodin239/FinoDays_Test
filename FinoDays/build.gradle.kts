import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    kotlin("jvm") version "1.4.31"
    kotlin("plugin.spring") version "1.4.31"
    kotlin("plugin.allopen") version "1.4.31"
    kotlin("plugin.noarg") version "1.4.31"
}

group = "com.venus"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_15

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.4")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.5")
    implementation("org.springframework.boot:spring-boot-starter-security:2.5.4")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("io.jsonwebtoken:jjwt:0.9.1")
    implementation("io.jsonwebtoken:jjwt-api:0.11.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.5")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")

    implementation("org.junit.jupiter:junit-jupiter:5.7.2")

    implementation("org.springdoc:springdoc-openapi-webmvc-core:1.5.10")
    implementation("org.springdoc:springdoc-openapi-ui:1.5.10")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.4")
    implementation(group = "org.springframework.data", name = "spring-data-elasticsearch", version = "4.1.7")

    implementation(group = "org.springframework.boot", name = "spring-boot-starter-validation")
    implementation(group = "org.postgresql", name = "postgresql")

    developmentOnly("org.springframework.boot:spring-boot-devtools:2.5.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.4")

    compile("org.apache.commons:commons-csv:1.9.0")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "15"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
