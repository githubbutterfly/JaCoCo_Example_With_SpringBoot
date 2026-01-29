# JaCoCo Spring Boot Project

A minimal Spring Boot application with JaCoCo code coverage.

## Requirements

- Java 17+
- Maven 3.6+

## Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

## Run Tests & Coverage

```bash
mvn test
```

JaCoCo report is generated at:

`target/site/jacoco/index.html`

Open it in a browser to see line/branch coverage.

## Endpoints

- `GET /greet?name=Alice` — returns "Hello, Alice!"
- `GET /greet` — returns "Hello, World!"
- `GET /add?a=2&b=3` — returns 5
