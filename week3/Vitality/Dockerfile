FROM eclipse-temurin:17-jdk-alpine
VOLUME /temp
ARG JAR_FILE=target/Vitality-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java" , "-jar","/app.jar"]
EXPOSE 8080