FROM tomcat:8.0.20-jre8
MAINTAINER Aditya Lad
EXPOSE 8090
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/demo-0.0.1-SNAPSHOT.jar