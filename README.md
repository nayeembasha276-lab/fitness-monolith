# Fitness Monolith API

A production-grade Fitness Tracking REST API built using Spring Boot. 
The application provides secure user authentication, activity tracking, personalized recommendations, and cloud deployment.

##  Live Demo

**Live API:** https://fitness-monolith-9zc8.onrender.com
**Swagger API Documentation:** https://fitness-monolith-9zc8.onrender.com/swagger-ui/index.html

## Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate

### Security
- JWT Authentication
- Role-Based Authorization
- BCrypt Password Encryption

### Database
- MySQL (Development)
- PostgreSQL (Production)
- Neon PostgreSQL (Cloud Database)

### Deployment
- Docker
- Render

##  Features

- User Registration
- User Login
- JWT-based Authentication
- Secure REST APIs
- Password Encryption using BCrypt
- Activity Tracking
- Personalized Recommendations
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Dockerized Application
- Cloud Deployment with Render
- PostgreSQL Database hosted on Neon

##  API Endpoints

### Authentication APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Authenticate user and generate JWT |

### Activity APIs

| Method | Endpoint | Description |
| GET | `/api/activities` | Get user activities |
| POST | `/api/activities` | Track a new activity |

### Recommendation APIs

| Method | Endpoint | Description |
| POST | `/api/recommendation/generate` | Generate recommendation |
| GET | `/api/recommendation/user/{userId}` | Get user recommendations |
| GET | `/api/recommendation/activity/{activityId}` | Get activity recommendations |


## Architecture

Client / Frontend
       │
       ▼
Spring Boot REST API
       │
       ├── Spring Security
       ├── JWT Authentication
       ├── Service Layer
       ├── Repository Layer
       │
       ▼
PostgreSQL Database
       │
       ▼
Neon Cloud Database


## Deployment Architecture
Dockerized Spring Boot Application
              │
              ▼
           Render
       Backend Hosting
              │
              ▼
       Neon PostgreSQL
        Cloud Database

## API Documentation
Swagger UI is available at:
https://fitness-monolith-9zc8.onrender.com/swagger-ui/index.html

## Author
## Nayeem Basha
## Java Backend Developer

        
