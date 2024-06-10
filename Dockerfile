FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar bookstore.jar
ENTRYPOINT ["java","-jar","/bookstore.jar"]
