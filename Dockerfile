FROM openjdk:11
EXPOSE 8080
ADD target/example.smallest-0.0.1-SNAPSHOT.jar example.smallest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/example.smallest-0.0.1-SNAPSHOT.jar"]