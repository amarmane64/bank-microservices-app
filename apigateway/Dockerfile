#Start with a base image containing Java runtime
FROM adoptopenjdk/openjdk8 as build

# Add the application's jar to the container
COPY target/apigateway-0.0.1-SNAPSHOT.jar apigateway-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/apigateway-0.0.1-SNAPSHOT.jar"]