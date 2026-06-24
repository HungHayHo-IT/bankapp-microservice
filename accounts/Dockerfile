# Build source
FROM maven:3.9.6-amazoncorretto-21 AS builder

WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# Runtime
FROM amazoncorretto:21-alpine

WORKDIR /app

COPY --from=builder /build/target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]