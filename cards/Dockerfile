#build ma nguon
FROM maven:3.9.6-amazoncorretto-21 AS builder

WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests


#build moi truong chay
FROM amazoncorretto:21-alpine

WORKDIR /app

COPY --from=builder /build/target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "cards-0.0.1-SNAPSHOT.jar"]