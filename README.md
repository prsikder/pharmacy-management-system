# Pharmacy Management System 💊

A Java Swing + MySQL based Pharmacy Management System built using **NetBeans IDE**.  
This application helps manage medicines, customers, billing, and stock efficiently.

---

## 🚀 Features

- Add, update, and delete medicines
- Customer management
- Billing system with invoice generation
- Stock management
- MySQL database integration using XAMPP / phpMyAdmin
- Executable `.exe` build for easy setup

---

## 🛠️ Tech Stack

- Java Swing (GUI)
- MySQL Database
- NetBeans IDE
- XAMPP / phpMyAdmin

---

## 📂 Project Structure

```text
src/                        → Java source code
db/pharma.sql               → Database export file
config.properties.example   → Database configuration template
PharmacySetup.exe           → Executable application
```

---

## ⚙️ How to Run (Source Code)

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/pharmacy-management-system.git
```

### 2. Open the Project

Open the project using **NetBeans IDE**.

### 3. Setup the Database

1. Start Apache and MySQL in XAMPP
2. Open phpMyAdmin
3. Create a database named:

```sql
pharma
```

4. Import the file:

```text
db/pharma.sql
```

### 4. Configure Database Credentials

Copy:

```text
config.properties.example
```

Rename it to:

```text
config.properties
```

Then update your MySQL username and password.

### 5. Run the Project

Run the project from NetBeans IDE.

---

## 🖥️ How to Run the Executable

1. Install XAMPP
2. Start Apache and MySQL
3. Import `db/pharma.sql` using phpMyAdmin
4. Configure `config.properties`
5. Run:

```text
PharmacySetup.exe
```

---

## 🔐 Default Database Credentials

```text
Username: root
Password:
```

(Default XAMPP configuration)

---

## 📌 Notes

- Make sure MySQL service is running before starting the application.
- Java JDK must be installed to run the source project.
- The `.exe` version still requires database setup.

---

## 👨‍💻 Author

Developed as a Java Desktop Application project using NetBeans and MySQL.
