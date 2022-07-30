FROM openjdk:8-jdk-alpine
MAINTAINER amanuel.com
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]