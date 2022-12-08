FROM openjdk:11
EXPOSE 8080
ADD target/SeleniumImage.jar SeleniumImage.jar
ENTRYPOINT ["java","-jar","/SeleniumImage.jar"]