# dont

Experimental, opinionated boilerplate for React &amp; Spring Boot.

## Try this

### Build everything & run the jar like you might in production

```
./gradlew clean build
java -jar ./api/build/libs/api-0.0.1-SNAPSHOT.jar
```
Now browse to http://localhost:8080/ or run `curl http://localhost:8080/api

### Start the React web application for development

```
./gradlew web:start
```

Now browse to http://localhost:3000/

### Start the Spring Boot api application for development

```
./gradlew api:bootRun
```

Now browse to http://localhost:8080/ or run `curl http://localhost:8080/api`
