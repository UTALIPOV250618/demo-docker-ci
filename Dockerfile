FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY /target/demo-docker.jar /app/demo-docker.jar
ENTRYPOINT ["java","-jar","demo-docker.jar"]