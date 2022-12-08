FROM openjdk:11
EXPOSE 8080
ADD target/example.smallest-0.0.1-SNAPSHOT.war example.smallest-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/example.smallest-0.0.1-SNAPSHOT.war"]