#first stage
FROM maven:3.8.6-openjdk-11-slim AS builderStep
ADD . /app
RUN mvn -f /app/pom.xml -DskipTests package

#second stage
FROM openjdk:11-jre-slim
RUN useradd -m kritika
USER kritika
COPY --from=builderStep /app/target/filter_fleet.jar filter_fleet.jar
ENTRYPOINT ["java", "-jar", "/filter_fleet.jar"]