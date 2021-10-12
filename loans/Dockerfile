#Start with a base image containing Java runtime
FROM adoptopenjdk/openjdk8 as build

# Add the application's jar to the container
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/loans-0.0.1-SNAPSHOT.jar"]