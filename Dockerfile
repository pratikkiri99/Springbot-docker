FROM openjdk:8
ADD target/SpringBootZuulDocker.jar SpringBootZuulDocker.jar
EXPOSE 8989
ENTRYPOINT ["java", "-jar", "SpringBootZuulDocker.jar"]
