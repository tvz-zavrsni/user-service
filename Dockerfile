FROM adoptopenjdk:11-jre-hotspot
COPY .app ./build/libs/webshop-user-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", ".app"]
