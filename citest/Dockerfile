FROM java:8
VOLUME /tmp
ARG JAR_FILE=target/citest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} citest.jar
EXPOSE 80
RUN bash -c 'touch /citest.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/citest.jar"]