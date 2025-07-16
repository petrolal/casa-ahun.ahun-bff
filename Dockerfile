FROM eclipse-temurin:21-jdk-jammy

VOLUME /tmp

COPY build/libs/ahun-bff-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", ".jar", "/app.jar"]