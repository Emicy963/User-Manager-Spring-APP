# User Manager Spring App

## Description
This is a Spring Boot project for managing users. It provides a secure RESTful API that enables user registration, authentication using JWT, and password encryption using BCrypt. The application is configured to work with either MySQL or PostgreSQL as the database and uses Spring Security for endpoint protection.

Note: This repository covers the backend implementation up until the integration with the frontend. The frontend and deployment will be added later.
___

## 📋 Technologies Used
- Spring Boot 3.x
- Spring Security 🔒
- JPA/Hibernate for ORM
- JWT (JSON Web Token) for secure authentication
- BCrypt for password encryption
- MySQL / PostgreSQL for database management
- Lombok to reduce boilerplate code
- Spring Boot DevTools for easier development

## 🚀 Features
- User Registration ✍️
- Secure Authentication with JWT
- Password Encryption using BCrypt
- Database Integration with MySQL or PostgreSQL
- RESTful API architecture

## 📋 Prerequisites

Before running the project, ensure you have:
- Java 21 (or higher)
- Maven for dependency management
- MySQL or PostgreSQL (choose your preferred database)
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)
- A tool like Postman to test the API endpoints

## 🛠️ Getting Started
### 1. Clone este repositório:

   ```bash
   git clone https://github.com/Emcy963/User-Manager-Spring-APP.git
   cd User-Manager-Spring-APP
   ```

### 2. Configure the Database:
- For MySQL:
   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    spring.jpa.hibernate.ddl-auto=update
   ```

- For PostgreSQL:
   ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.hibernate.ddl-auto=update
   ```

### 3. Build Project:
Run the following command in the project directory:
   ```bash
   mvn clean install
   ```

### 4. Run the application:
Start the Spring Boot Application
   ```bash
   mvn spring-boot:run
   ```

### 5. API EndPoints:
Use Postman or your preferred API testing tool to interact with the following endpoints:
- POST `/api/users` - Register a new user ✍️
- POST `/api/auth/login` - Authenticate user (returns JWT token) 🔑
- GET `/api/users` - Retrieve all users (protected endpoint) 📋
- GET `/api/users/{id}` - Retrieve only one user from ID (protected endpoint) 📋

## Project Structure

```
User-Manager-User/
│── main/
│   ├── java/
│       ├── com/dev/manager_user/
│           ├── config/
│               ├── PasswordConfig.java
│           ├── controller/
│               ├── AuthController.java
│               ├── UserController.java
│           ├── dto/
│               ├── UserDTO.java
│           ├── model/
│               ├── User.java
│           ├── repository/
│               ├── UserRepository.java (Interface for database operations)
│           ├── service/
│               ├── JwtService.java
│               ├── UserService.java
│           ├── ManagerUserApplication.java
│── .gitattributes
│── .gitignore
│── mvnw
│── mvnw.cmd
│── pom.xml
│── README.md
```
## Next Steps

🔜 **Frontend Integration**: A React frontend will be developed to interact with this API.

🔜 **Deployment**: The deployment of the backend and frontend will be handled later on platforms like Railway or Render.

## 🤝 Contributing

Welcome contributions to improve this todos apps! Here's how you can contribute:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/AmazingFeature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
5. Push to the branch (`git push origin feature/AmazingFeature`)
6. Open a Pull Request

Please make sure to update tests as appropriate and here to the project's coding standards.

### Reporting Issues

If you find a bug or have a suggestion for improvement, please open an issue on the GitHub repository. Provide as much detail as possible, including steps to reproduce the issue if applicable.

## 📝 License

This project is under the MIT license. View the archive `LICENSE` for more details.

## 👥 Author

Cafu Dev - [Emicy963](https://github.com/Emicy963)

Email: [Emicy963](emicy963@proton.me)
