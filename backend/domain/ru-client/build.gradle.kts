import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
        import nu.studer.gradle.jooq.JooqEdition
        import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
        import org.jooq.meta.jaxb.ForcedType

plugins {
    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"
    id("org.springframework.boot") version "2.7.4"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"
    id("nu.studer.jooq") version "7.1.1"

}

group = "com.fs.platform.ru"
version = "0.0.2-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":backend:domain:ru-client-model"))
    implementation(project(":backend:domain:ru-service-model"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-tomcat")
    implementation("org.springframework:spring-core")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springdoc:springdoc-openapi-webmvc-core:1.6.12")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.12")
    implementation("org.jooq:jooq-kotlin:3.17.4")
    implementation("com.graphql-java:graphql-java-extended-scalars:22.0")
    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter-logging")
    implementation("org.apache.logging.log4j:log4j-api:2.23.1")
    implementation("org.apache.logging.log4j:log4j-core:2.23.1")
    implementation("org.liquibase:liquibase-core:4.22.0")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("org.springframework:spring-orm:6.0.10")
    implementation("org.postgresql:postgresql:42.5.0")
    implementation("com.google.api-client:google-api-client:2.4.0")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.35.0")
    implementation("com.google.api-client:google-api-client-gson:2.4.0")
    implementation("com.google.apis:google-api-services-calendar:v3-rev411-1.25.0")
    implementation("io.micrometer:micrometer-core:1.13.0")
    implementation("io.micrometer:micrometer-registry-prometheus:1.12.5")
    implementation("org.springframework:spring-aspects:6.1.6")
    implementation("org.springframework.boot:spring-boot-starter-aop:3.2.5")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.6.0")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("org.postgresql:postgresql")

    jooqGenerator("org.postgresql:postgresql:42.5.0")
    jooqGenerator("jakarta.xml.bind:jakarta.xml.bind-api:4.0.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework:spring-webflux")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes["Main-Class"] = "com.fs.client.ClientServiceAppKt"
    }
    from(sourceSets.main.get().output)
    from(sourceSets.main.get().resources)
    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
    archiveBaseName.set("ru-client")
    archiveVersion.set("0.0.2-SNAPSHOT")
    archiveClassifier.set("")
    destinationDirectory.set(file("$buildDir/libs"))
}

java.sourceSets["main"].java {
    srcDir("src/generated/jooq")
}

kotlin {
    jvmToolchain(17)
}
        //jooq {
//    version.set("3.16.7")
//    edition.set(JooqEdition.OSS)
//
//    configurations {
//        create("main") {
//            jooqConfiguration.apply {
////                logging = Logging.WARN
//                jdbc.apply {
//                    driver = "org.postgresql.Driver"
////                    url = "jdbc:postgresql://service-db/funScrut"
////                    user = "username"
////                    password = "password"
////                    url = "jdbc:postgresql://localhost:5432/FunScrut2"
////                    user = "postgres"
////                    password = "191220#destin"
//                    url = "jdbc:postgresql://funscrut.online:15432/fun_scrut"
//                    user = "username"
//                    password = "password"
////                    properties = listOf(
////                        Property().apply {
////                            key = "PAGE_SIZE"
////                            value = "2048"
////                        }
////                    )
//                }
//                generator.apply {
//                    name = "org.jooq.codegen.KotlinGenerator"
//                    database.apply {
//                        name = "org.jooq.meta.postgres.PostgresDatabase"
//                        inputSchema = "public"
//                        forcedTypes = listOf(
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.client.ru.enums.ClientRoleModel"
//                                includeExpression = ".*client.role"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.client.ru.enums.EducationModel"
//                                includeExpression = ".*client.education_status"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.client.ru.enums.EmploymentModel"
//                                includeExpression = ".*client.employment"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.client.ru.enums.CurrencyModel"
//                                includeExpression = ".*country.currency"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.client.ru.enums.CountryNameModel"
//                                includeExpression = ".*country.name"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.service.ru.enums.IndustryModel"
//                                includeExpression = ".*company.company_industry"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.service.ru.enums.OrderStatus"
//                                includeExpression = ".*order.order_status"
//                                includeTypes = ".*"
//                            },
//                            ForcedType().apply {
//                                isEnumConverter = true
//                                userType = "com.fs.service.ru.enums.CompanyLegalCapacityStatus"
//                                includeExpression = ".*company.legal_capacity_status"
//                                includeTypes = ".*"
//                            }
//                        )
//                    }
//                    generate.apply {
//                        isDeprecated = false
//                        isRecords = true
//                        isImmutablePojos = false
//                        isFluentSetters = true
//                        isPojos = true
//                        withSequences(false)
//                    }
//                    target.apply {
//                        packageName = "com.fs.domain.jooq"
//                        directory = "src/generated/jooq"
//                    }
//                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
//                }
//            }
//        }
//    }
//}

