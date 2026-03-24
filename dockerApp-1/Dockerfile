 FROM eclipse-temurin:17

LABEL maintainer="nandinirinu@gmail.com"

WORKDIR /app

COPY target/dockerApp-1-0.0.1-SNAPSHOT.jar /app/springboot-docker.jar

ENTRYPOINT ["java","-jar","springboot-docker.jar"]