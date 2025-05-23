# Stage 1: Build the application
FROM maven:3.9.8-eclipse-temurin-21 AS build
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn clean install -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:21
COPY --from=build /app/target/*.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]