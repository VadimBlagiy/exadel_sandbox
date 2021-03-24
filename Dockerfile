FROM openjdk:15
EXPOSE 8080
ADD ./sandbox-web/build/libs/sandbox-web-0.0.1-SNAPSHOT.jar /opt/sandbox-web-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/opt/sandbox-web-0.0.1-SNAPSHOT.jar" ]