FROM openjdk:8-jdk-alpine
LABEL maintainer="ramiroaquinoromero@gmail.com"
VOLUME /rest_api
ADD build/libs/rest_api.jar rest_api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]