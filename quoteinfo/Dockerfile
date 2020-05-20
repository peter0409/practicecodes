FROM openjdk:8-jdk-alpine
RUN apk add bash && apk update
WORKDIR /usr/app/src
COPY ./target/quoteinfo-0.0.1-SNAPSHOT.jar app.jar
RUN ls -lptr
RUN chmod 755 app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]