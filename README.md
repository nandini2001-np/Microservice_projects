#  Microservices Project (Spring Boot)

##  Overview
This is a Microservices-based project built using Spring Boot.  
It demonstrates how multiple services communicate with each other using a centralized architecture.

---

## 🏗️ Architecture Components

- **API Gateway** → Routes requests to services
- **Service Registry (Eureka Server)** → Service discovery
- **Config Server** → Centralized configuration
- **Microservices**:
  - Employee Service
  - Department Service
  - Order Service
  - Product Service

---

## ▶️ How to Run

1. Start **Service Registry (Eureka Server)**
2. Start **Config Server**
3. Start all Microservices:
   - Employee Service
   - Department Service
   - Order Service
   - Product Service
4. Start **API Gateway**
5. Access APIs through Gateway

## 💡 Features

- Service Discovery using Eureka
- Centralized Configuration
- API Gateway Routing
- Microservices Communication

  ## 🏗️ Architecture Diagram

Client → API Gateway → Microservices  
                ↓  
         Eureka Server (Service Discovery)  
                ↓  
         Config Server (Centralized Config)
