# microservices-kafka-eureka-gateway

This project demonstrates a comprehensive microservices architecture utilizing Spring Boot, Docker, and a suite of supporting 
technologies to create a resilient, scalable, and secure application ecosystem. The architecture includes service discovery, 
configuration management, authentication, message brokering, and different data storage solutions, making it a good blueprint 
for enterprise-grade applications.

## Core Technologies

- **Spring Boot**: Serves as the backbone for creating microservices, offering out-of-the-box support for configuration management, service discovery, and more.
- **Docker & Docker Compose**: Containerization of services for ease of deployment, scalability, and isolation.
- **PostgreSQL**: Relational database service instances for `order-service` and `inventory-service`.
- **MongoDB**: Document-based NoSQL database used by `product-service`.
- **Kafka**: Message broker facilitating asynchronous communication and event-driven architecture between services.
- **Keycloak**: Authentication and authorization service providing secure access to services.
- **Zipkin**: Distributed tracing system for monitoring and troubleshooting latency problems.
- **Eureka**: Service discovery to automatically detect services in the network.
- **API Gateway**: Centralized entry point for routing client requests to the appropriate backend service.


## Setup

### With Docker
Ensure Docker and Docker Compose are installed on your system. Clone the repository and navigate to the root directory of the project.

```sh
mvn clean package -DskipTests
docker-compose up -d
```

### Without Docker
   
```sh
mvn clean verify -DskipTests
mvn spring-boot:run
```

### Dependencies and Configuration

Service configurations, including environment variables and dependencies, are defined in the `docker-compose.yml` file. 
Modify these settings as needed to suit your deployment requirements.