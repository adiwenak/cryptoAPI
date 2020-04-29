FROM openjdk:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 1111
ENTRYPOINT ["java","-jar","/app.jar"]