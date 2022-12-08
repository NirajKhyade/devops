FROM openjdk:11
EXPOSE 8080
ADD target/Jenkins_Docker.jar Jenkins_Docker.jar
ENTRYPOINT ["java","-jar","/Jenkins_Docker.jar"]