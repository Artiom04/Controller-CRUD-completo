# 🧩Controller-CRUD-completo
A Spring Boot project that implements a fully functional REST controller with complete CRUD (Create, Read, Update, Delete) features.
The goal is to provide a clear, clean, and working example of how to manage an entity through RESTful API endpoints.

---
## ✨ Features

- 📌 **Create Items** – Add a new entity to the database using POST requests
- 📋 **Read Items** – Fetch all items or a single item by ID
- ✏️ **Update Items** – Modify an existing entity
- 🗑️ **Delete Items** – Remove an entity from the database
- 🌐 **RESTful Endpoints** – Clean and standard API structure
- 🧩 **Layered Architecture** – Controller, Service, Repository, and Model
- 🗃️ **Spring Data JPA** – Easy integration with any SQL database


## 📋 Prerequisites
- Java 17+
- Spring Boot (Web, JPA, Validation)
- Spring Data JPA
- MySQL 
- Maven
- An HTTP client (Postman)


## ⚙️ Installation
1. 📥 Clone the repository:
   ```bash
   git clone https://github.com/your-username/Controller-CRUD-complete.git
   cd Controller-CRUD-complete
   ```
2. 🏗️ Build & Run the Project:
   ```bash
   mvn spring-boot:run
   ```
3. 🚀 API Usage
   Once the application is running, you can access the API at:
   ```bash
   http://localhost:8080/api/users
   ```
## 📌 Available Endpoints

| Method | Endpoint          | Description             |
|--------|--------------------|-------------------------|
| GET    | `/api/users`      | Retrieve all items      |
| GET    | `/api/users/{id}` | Retrieve item by ID     |
| POST   | `/api/users`      | Create a new item       |
| PUT    | `/api/users/{id}` | Update an existing item |
| DELETE | `/api/users/{id}` | Delete item by ID       |

## 📝 Example Entity
```bash
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
}
```
## 🧠 Example JSON Requests
➕ Create Item (POST)
```bash
{
   "name": "Mario",
   "eta": 25
}
```

## 📄 License
This project is licensed under the MIT License.

🙏 Acknowledgements
- Spring Boot Team
- Spring Data JPA
- The open-source community






   
   
