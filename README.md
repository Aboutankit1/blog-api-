# 📋 Blog API – Spring Boot (Java 17)

A simple RESTful API for blog post management built with **Spring Boot**, **MySQL**, **JPA**, and **Swagger (OpenAPI 3)**.

---

## 🚀 Features

* ✅ Create, Read, Update, Delete (CRUD) Blog Posts
* ✅ RESTful APIs with Spring Boot
* ✅ MySQL Database Integration
* ✅ Swagger UI (OpenAPI 3) for API Testing
* ✅ Lombok for cleaner code

---

## 📦 Tech Stack

* Java 17
* Spring Boot 3.x
* Spring Data JPA
* MySQL
* Swagger (springdoc-openapi)
* Lombok

---

## 📁 Folder Structure

```
src/main/java/com/ankit/blogapi/
├── BlogApiApplication.java
├── controller/
│   └── BlogController.java
├── entity/
│   └── Blog.java
├── repository/
│   └── BlogRepository.java
└── config/
    └── SwaggerConfig.java
```

---

## 🛠️ Setup Instructions

### 🔧 Prerequisites

* Java 17 installed
* MySQL Server running (Workbench or terminal)
* Maven installed

### ⚙️ MySQL Setup

Create a database:

```sql
CREATE DATABASE blogdb;
```

---

### 📄 application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blogdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Swagger UI
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
```

---

## ▶️ Running the App

```bash
./mvnw spring-boot:run
```

---

## 🧪 API Testing (Postman or Swagger)

### 🔗 Base URL

```
http://localhost:8080/api/blogs
```

| Method | Endpoint          | Description        |
| ------ | ----------------- | ------------------ |
| POST   | `/api/blogs`      | Create a blog post |
| GET    | `/api/blogs`      | Get all blogs      |
| GET    | `/api/blogs/{id}` | Get blog by ID     |
| PUT    | `/api/blogs/{id}` | Update blog by ID  |
| DELETE | `/api/blogs/{id}` | Delete blog by ID  |

---

### 🔍 Swagger UI

After starting the app, open:

```
http://localhost:8080/swagger-ui.html
```

or

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🙋 Author

**Ankit Kumar**
💼 Java Backend Developer
📧 [ankit@example.com](mailto:ankit@example.com) *(Replace with your actual email)*

---

## 🗪 License

This project is open-source and available under the [MIT License](LICENSE).
