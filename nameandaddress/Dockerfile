FROM openjdk:8-jdk-alpine
VOLUME data
RUN apk add bash && apk update
WORKDIR /usr/app/src
COPY ./target/nameandaddress-0.0.1-SNAPSHOT.jar app.jar
COPY ./setup.sh setup.sh
RUN ls -lptr
RUN chmod 755 app.jar
RUN chmod 755 setup.sh
EXPOSE 8080
ENTRYPOINT ["sh","./setup.sh"]