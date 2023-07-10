FROM amazoncorretto:17-alpine
VOLUME /tmp


COPY /rest-service/target/rest-service-0.0.1-SNAPSHOT.jar gs-rest-service-0.1.0.jar

ENTRYPOINT ["java","-jar","/gs-rest-service-0.1.0.jar"]