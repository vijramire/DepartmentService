from openjdk:11
EXPOSE 8600
ADD target/departmentservice.jar departmentservice.jar
ENTRYPOINT ["java","-jar","departmentservice.jar"]