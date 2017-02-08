FROM maven:3.3.9
RUN mkdir /code
COPY . /code
RUN cd /code
EXPOSE 8080
CMD mvn spring-boot:run