FROM openjdk:8-jdk-alpine
MAINTAINER amanuel.com
ADD target/web-0.0.1-SNAPSHOT.war web.war
ENTRYPOINT ["java","-jar","/web.war"]