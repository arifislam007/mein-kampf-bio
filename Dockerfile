# Use the official OpenJDK image as a base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the WAR file from the target directory into the container
COPY target/mein-kampf-bio.war app.war

# Expose the port that the application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.war"]
