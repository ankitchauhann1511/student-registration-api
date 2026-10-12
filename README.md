# Student Registration System

## 📌 Project Overview

The Student Registration System is a backend application developed using Java and Spring Boot to manage student information efficiently. It provides RESTful APIs to perform CRUD (Create, Read, Update, and Delete) operations on student records.
The application uses Spring Data JPA for database interactions and MySQL for persistent data storage. It follows a layered architecture to maintain clean, modular, and maintainable code.


## 🎯 Features

* Create Student: Register a new student.
* View Students:  Retrieve all registered students.
* Get Student by ID:  Fetch student details using a unique ID.
* Update Student:  Modify existing student information.
* Delete Student:  Remove a student record.
* RESTful APIs:  Communicate with the application through HTTP requests.
* Database Integration:  Store and manage student information using MySQL.
* Layered Architecture:  Separate controller, service, and repository responsibilities.


## 🛠️ Technologies Used

| Technology      | Purpose                                    |
| --------------- | ------------------------------------------ |
| Java            | Backend programming language               |
| Spring Boot     | Application development framework          |
| Spring Web      | REST API development                       |
| Spring Data JPA | Database access and persistence            |
| Hibernate       | ORM implementation                         |
| MySQL           | Relational database                        |
| Maven           | Dependency management and build automation |
| Postman         | API testing                                |
| Git & GitHub    | Version control and code hosting           |


## 🏗️ Project Architecture

The application follows a layered architecture:

  
Client (Postman)
      |
      v
REST Controller
      |
      v
Service Layer
      |
      v
Repository Layer
      |
      v
MySQL Database


**Layer Responsibilities:**

* Controller: Handles HTTP requests and returns responses.
* Service: Contains business logic and processes application operations.
* Repository: Uses Spring Data JPA to interact with the database.
* Entity/Model: Represents student data stored in the database.

## 📂 Project Structure


Student-Registration-System/

├── src/

│     ├── main/

│     │     ├── java/

│     │     │   └── com/example/

│     │     │        ├── controller/

│     │     │        ├── service/

│     │     │        ├── repository/

│     │     │        ├── model/

│     │     │        └── StudentRegistrationApplication.java

│     │     └── resources/

│     │              └── application.properties
 
│     └── test

├── pom.xml

└── README.md


## ⚙️ Prerequisites

Ensure the following software is installed:

* Java Development Kit (JDK)
* Maven
* MySQL Server
* Postman
* Git


## 🚀 Installation and Setup

1. Clone the Repository
git clone <your-github-repository-url>


2. Navigate to the Project Directory
cd Student-Registration-System


3. Create the MySQL Database
Open MySQL and execute:
CREATE DATABASE student_db;


4. Configure Database Connection
Update src/main/resources/application.properties:

5. Build the Project
mvn clean install

6. Run the Application
mvn spring-boot:run

Once the application starts successfully, you can send HTTP requests to its configured local port.


## 🔗 REST API Endpoints

The following is an example endpoint design. Adjust the paths and request fields to match your implementation.

Assuming your controller uses "/api/students" as its base path:

| HTTP Method | Endpoint             | Description                |
| ----------- | -------------------- | -------------------------- |
| POST        |  /api/students       | Register a new student     |
| GET         |  /api/students       | Retrieve all students      |
| GET         |  /api/students/{id}  | Retrieve a student by ID   |
| PUT         |  /api/students/{id}  | Update student information |
| DELETE      |  /api/students/{id}  | Delete a student           |


Example: Register a Student
Request:

http
POST /api/students
Content-Type: application/json


Example JSON body:

json

{

  "name": "Rahul Sharma",
  
  "email": "rahul@example.com",
  
  "course": "BCA"
  
}


## 🧪 API Testing
The REST APIs can be tested using Postman.

Testing includes:

* Creating student records.
* Retrieving all student records.
* Retrieving a student by ID.
* Updating existing student information.
* Deleting student records.
* Checking HTTP status codes and API responses.
  

## 💡 Learning Outcomes
Through this project, I strengthened my understanding of:

* Java and object-oriented programming.
* Spring Boot application development.
* RESTful API design and implementation.
* CRUD operations.
* Spring Data JPA and Hibernate.
* MySQL database integration.
* Layered backend architecture.
* API testing using Postman.
* Maven-based project management.
  

## 🔮 Future Enhancements

* Add input validation.
* Implement global exception handling.
* Add pagination and sorting.
* Implement Spring Security authentication and authorization.
* Develop a frontend interface.
* Add automated unit and integration tests.
  

👨‍💻 Author
Ankit Chauhan
Java Backend Developer |

Technical Interests: Java, Spring Boot, REST APIs, SQL, Microservices, Kafka, CI/CD, and Backend Development.
