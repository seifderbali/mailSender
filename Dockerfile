# Use official OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Add a volume to store temporary files
VOLUME /tmp

# Set argument to specify the JAR file to run
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container and rename it to app.jar
COPY ${JAR_FILE} app.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
