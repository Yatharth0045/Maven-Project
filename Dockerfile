FROM openjdk:8-jdk-alpine

WORKDIR /test-dir

COPY target/SampleMavenProject-1.0-SNAPSHOT-shaded.jar /test-dir

ENTRYPOINT ["java"]

CMD ["-jar","SampleMavenProject-1.0-SNAPSHOT-shaded.jar"]