FROM openjdk:8-jdk-alpine

ARG JAR_FILE=/var/lib/jenkins/.m2/repository/com/poc/demo/0.0.1-SNAPSHOT/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
