# NEETPathFinder

> Your Pathway to Medical College Admission Success!  
> A smart web app that predicts medical colleges for NEET aspirants based on their rank or percentile.


## 🌟 Features

- 🎯 **Accurate College Prediction** based on NEET rank/percentile  
- 🔐 **Secure User Authentication** with JWT token authorization  
- 📱 **Responsive UI** built with React and Bootstrap  
- ⚙️ **Robust Backend** powered by Java and Spring Boot  
- 🗄️ **MySQL Database** for reliable data storage  
- 📧 **Email Notifications** for confirmations and updates  


## 🚀 Tech Stack

| Layer       | Technology          |
| ----------- | ------------------- |
| Frontend    | React, Bootstrap    |
| Backend     | Java, Spring Boot   |
| Database    | MySQL               |
| Auth        | JWT Tokens          |
| Build Tools | Maven, npm          |


## 🛠️ Getting Started

### Prerequisites
- Java 11+  
- Maven  
- Node.js & npm  
- MySQL  

### Setup Instructions

1. Clone the repository
   `bash
   
   cd NEETPathFinder



2. Configure Backend

Go to Backend/src/main/resources/

Rename application.example.properties to application.properties

Update DB & email credentials:

ini- 

spring.datasource.url=jdbc:mysql://localhost:3306/neetdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.mail.username=your_email@example.com
spring.mail.password=your_email_password


3. Create the MySQL database:
CREATE DATABASE neetdb;

Run backend:
cd Backend
./mvnw spring-boot:run

Configure Frontend
cd Frontend
npm install
npm start
Visit: http://localhost:3000

🎓 How to Use
Register and log in securely
Enter your NEET rank or percentile
Explore predicted medical colleges
Apply filters: state, category, quota
Receive timely email notifications


👥 Contributors
Madhushree K M - Mail ID| madhushreekm023@gmail.com
