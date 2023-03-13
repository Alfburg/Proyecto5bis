FROM amazoncorretto:11-alpine-jdk
MAINTAINER AB
copy target/AB-0.0.1-SNAPSHOT.jar  ab-app.jar
entrypoint ["java", "-jar", "/ab-app.jar"]
