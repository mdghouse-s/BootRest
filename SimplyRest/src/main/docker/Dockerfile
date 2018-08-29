FROM openjdk:8-jre-alpine
COPY ./target/SimplyRest-1.0.jar /usr/src/rest/
WORKDIR /usr/src/rest
EXPOSE 8001
CMD ["java", "-jar", "SimplyRest-1.0.jar"]