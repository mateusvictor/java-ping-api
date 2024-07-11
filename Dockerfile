# FROM openjdk:21
#FROM gradle:8.7.0-jdk21-alpine
#
#WORKDIR /app
#
#COPY . /app
#
#RUN chmod +x ./gradlew
#
#EXPOSE 8080
#
#CMD ["./gradlew", "bootRun"]

# -------------

# FROM eclipse-temurin:21-jdk-alpine
FROM openjdk:21

ARG JAR_FILE=./build/libs/ping-api-0.0.1.jar

#COPY . /app

COPY ${JAR_FILE} ping-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ping-api.jar"]

#
#COPY ${JAR_FILE} app.jar
#
#ENTRYPOINT ["java","-jar","/app.jar"]

# -------------
