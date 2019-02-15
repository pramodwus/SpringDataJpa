FROM openjdk:8
ADD target/SpringDataJpa.jar SpringDataJpa.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SpringDataJpa.jar"]
