
FROM maven:3.6.3 AS maven

WORKDIR /usr/src/app

ADD pom.xml /usr/src/app
RUN mvn verify --fail-never

COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN --mount=type=cache,target=/root/.m2  mvn clean package -Dmaven.test.skip

# For Java 18,
FROM openjdk:18-alpine3.15

ARG JAR_FILE=*.jar

WORKDIR /opt/app

# Copy the jar file from the maven stage to the /opt/app directory of the current stage.
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/musala-drone

ENTRYPOINT ["java","-jar","/opt/app/musala-drone"]