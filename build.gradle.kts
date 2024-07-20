plugins {
  id("com.avast.gradle.docker-compose") version "0.17.7"
}

repositories {
  mavenCentral()
}

subprojects {
  group = "com.github.alijalaal.keycloak-examples"
  version = "0.0.1-SNAPSHOT"

  repositories {
    mavenCentral()
  }
}

dockerCompose {
  useComposeFiles.add("compose.yaml")
  forceRecreate = true
  stopContainers = true
  captureContainersOutput = true
}
