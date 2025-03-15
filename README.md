# Sports Brands Microservices Application

This project implements a simplified microservices architecture for a Top Sports Brands application using Spring Boot. The current implementation includes two services:

1. **Eureka Server** - Service registry for microservice discovery
2. **Item Catalog Service** - Provides a list of popular sports brands

## Project Structure

### Eureka Server
- Package: `com.week9.lab`
- Main class: `EurekaServerApplication`
- Features:
  - Provides service registry and discovery
  - Allows services to register themselves
  - Dashboard available at http://localhost:8761

### Item Catalog Service
- Package: `com.week9.lab`
- Main class: `ItemCatalogServiceApplication`
- Key components:
  - `model.Item` - Entity class representing a sports brand
  - `repository.ItemRepository` - JPA repository with REST capabilities
  - `config.ItemInitializer` - Populates initial data for sports brands
- Features:
  - Registers with Eureka Server
  - Provides REST API for sports brands
  - Uses in-memory H2 database

## Configuration

### Eureka Server
```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

### Item Catalog Service
```properties
server.port=8088
spring.application.name=item-catalog-service
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:catalogdb
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## How to Run

### Start the Eureka Server
1. Open the project in your IDE
2. Run `EurekaServerApplication` as a Spring Boot app
3. Verify the server is running by accessing http://localhost:8761

### Start the Item Catalog Service
1. Run `ItemCatalogServiceApplication` as a Spring Boot app
2. Verify the service is registered with Eureka by checking the Eureka dashboard
3. Access the sports brands data at http://localhost:8088/items
4. Access the H2 database console at http://localhost:8088/h2-console
   - JDBC URL: `jdbc:h2:mem:catalogdb`
   - Username: `sa`
   - Password: leave empty

## API Endpoints

### Item Catalog Service
- `GET /items` - Get all sports brands
- `GET /items/{id}` - Get a specific sports brand by ID
- `POST /items` - Add a new sports brand
- `PUT /items/{id}` - Update a sports brand
- `DELETE /items/{id}` - Delete a sports brand

## Data Model

### Item (Sports Brand)
```json
{
  "id": 1,
  "name": "Nike"
}
```

## Technologies Used
- Java 21
- Spring Boot
- Spring Cloud Netflix Eureka
- Spring Data JPA
- Spring Data REST
- H2 Database
- Lombok

