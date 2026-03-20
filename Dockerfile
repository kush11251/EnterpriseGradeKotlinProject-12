# Dockerfile
FROM maven:3.9-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy pom.xml
COPY pom.xml .

# Build the project
RUN mvn clean package

# Copy the application
COPY src /app/src

# Expose port
EXPOSE 8080

# Run command
CMD ["mvn", "exec:java", "-Dexec.mainClass=com.company.app.EntryPoints.MainKt"]