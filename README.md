# 📚 CS4800 – Library Management System

This is a desktop-based Library Management System built using JavaFX, Hibernate ORM, and PostgreSQL. It allows users to manage student records through a simple graphical user interface.

## ✅ Features
- Add new students with:
  - Bronco ID
  - Name
  - Address
  - Degree
- Save student data to a PostgreSQL database using Hibernate
- Intuitive JavaFX GUI

## 🛠 Technologies Used
- Java 24
- JavaFX 24
- Hibernate ORM 6
- PostgreSQL
- Maven (Dependency Management)
- IntelliJ IDEA
- Astah & Draw.io (for design models)

## 📦 Project Structure
LibaryManagementSystem/
├── src/
│ └── main/java/org/example/
│ └── Main.java
│ └── Student.java
├── resources/
│ └── hibernate.cfg.xml
├── pom.xml

## 🖥 How to Run
1. **Set up PostgreSQL**
   - Create a database named `library_system`
   - Set username: `postgres`, password: `postgres` (or update in `hibernate.cfg.xml`)

2. **Clone the repository**
```bash
git clone https://github.com/sravurimain/cs4800.git
Run the application

Open in IntelliJ

Go to Run > Edit Configurations

Add VM options:
--module-path <your-path-to-javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml
