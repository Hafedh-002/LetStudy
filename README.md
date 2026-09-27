# LetStudy Final Project

## Stack
- Frontend: React + TypeScript + Vite
- Backend: Java + Spring Boot 4.1.1
- Database: MySQL
- Admin authentication: BCrypt password hashing + JWT bearer token

## Backend
1. Create a MySQL database named `letstudy`.
2. Open `backend/src/main/resources/application.properties`.
3. Replace `YOUR_MYSQL_PASSWORD` with the MySQL root password.
4. Run the backend with IntelliJ or `mvn spring-boot:run`.
5. Server: http://localhost:8080

A default admin is created automatically on first startup:
- Username: admin
- Password: admin123

Change the default password before deploying publicly.

## Frontend
Run inside `frontend`:

npm install
npm run dev

Open http://localhost:5173

## Admin security
The frontend receives a JWT after successful login. Admin write operations and dashboard data require `Authorization: Bearer <token>`. The backend, not localStorage, decides whether an admin request is authenticated.

Student GET content endpoints remain public. Quiz submission is public for the MVP.
