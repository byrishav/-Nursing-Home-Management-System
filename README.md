# 🏥 Nursing Home Management System

A desktop-based **Nursing Home Management System** developed using **Java Swing**, **JDBC**, and **MySQL**. The application streamlines day-to-day hospital operations such as patient registration, doctor management, admissions, billing, ward management, laboratory tests, and report generation through a user-friendly graphical interface.

---

## 📌 Features

- Secure Login System
- Doctor Registration & Management
- Patient Registration
- Patient Admission
- Patient Discharge
- Ward Management
- Laboratory Test Management
- Test Request & Report Generation
- Billing & Payment Management
- Revenue Reports
- Patient Reports
- Doctor Reports
- User-Friendly Java Swing Interface
- Database Integration using JDBC
- MySQL Database Support

---

## 🛠 Tech Stack

- Java
- Java Swing
- JDBC
- MySQL
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
Nursing-Home-Management-System
│
├── src/
│   ├── Splash.java
│   ├── Login.java
│   ├── Master.java
│   ├── DoctorRegistration.java
│   ├── PatientRegistration.java
│   ├── WardManagement.java
│   ├── Payment.java
│   ├── Reports.java
│   └── ...
│
├── assets/
│   ├── images/
│   └── icons/
│
├── database/
│   └── nursing_home.sql
│
└── README.md
```

---

## 🗄 Database

The application uses **MySQL** as its backend database.

Example connection:

```java
jdbc:mysql://localhost:3306/nursing_home
```

---

## 🚀 Installation

1. Clone the repository

```
git clone https://github.com/your-username/Nursing-Home-Management-System.git
```

2. Import the project into your preferred Java IDE.

3. Create a MySQL database named:

```
nursing_home
```

4. Import the SQL file located inside the **database/** folder.

5. Configure your database credentials in the connection class.

6. Run:

```
Splash.java
```
---

## 🎯 Future Enhancements

- Password Encryption (BCrypt)
- Role-Based Authentication
- Appointment Scheduling
- Email Notifications
- Backup & Restore
- Search & Filter Functionality
- PDF Report Generation
- Cloud Database Support

---

## 👨‍💻 Author

**Rishav Arya**


---

## 📄 License

This project is developed for educational and learning purposes.
