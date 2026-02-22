# Product Management API

A RESTful API built with Spring Boot for managing product/employee information with CRUD operations.

## Technology Stack

- **Java 21**
- **Spring Boot 3.2.0**
- **Spring Data JPA** - Database operations
- **H2 Database** - In-memory database
- **Lombok** - Reduce boilerplate code
- **SpringDoc OpenAPI** - API documentation
- **Maven** - Build tool

## Project Structure

```
Product/
├── src/main/java/com/thehartford/Product/
│   ├── controller/      # REST endpoints
│   ├── Model/          # Entity classes
│   ├── service/        # Business logic
│   ├── repo/           # Data access layer
│   └── ProductApplication.java
└── src/main/resources/
    └── application.yaml # Configuration
```

## Features

- Create new products/employees
- Retrieve all products or by ID
- Update existing products
- Delete products
- In-memory H2 database
- Swagger/OpenAPI documentation

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/products` | Create a new product |
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| PUT | `/products/{id}` | Update product |
| DELETE | `/products/{id}` | Delete product |

## Product Model

```json
{
  "id": 1,
  "name": "string",
  "department": "string",
  "salary": 0.0,
  "email": "string",
  "phoneNumber": "string",
  "address": "string"
}
```

## Prerequisites

- Java 21 or higher
- Maven 3.6+

## Running the Application

### Using Maven Wrapper

```bash
./mvnw spring-boot:run
```

### Using Maven

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8082`

## API Documentation

Access Swagger UI at: `http://localhost:8082/swagger-ui.html`

## Database Configuration

The application uses H2 in-memory database:
- **URL**: `jdbc:h2:mem:products`
- **Username**: `jafra`
- **Password**: `123`

## Building the Project

```bash
mvn clean install
```

## Running Tests

```bash
mvn test
```
