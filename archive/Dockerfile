FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/archive-0.0.1-SNAPSHOT.jar archive.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "archive.jar"]

