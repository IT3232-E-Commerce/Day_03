# Student Management System API

This project is a simple RESTful API for managing students using Spring Boot. The API allows you to perform CRUD (Create, Read, Update, Delete) operations on a list of students. Each student has a registration number, name, age, course and GPA.

## Features

- Create: Add a new student to the system.
- Read: Retrieve all students or search for a student by their registration number.
- Update: Modify the details of an existing student.
- Delete: Remove a student from the system.
- Sort by GPA: Get a list of students sorted by their GPA.
- Filter by Age: Get a list of students within a specified age range.

## API Endpoints

### 1. Create a New Student (POST)
- URL: `/app/students`
- Method: `POST`
- Request Body (JSON):
  ```json
  {
    "regNo": "2021ICT06",
    "name": "Scooby Doo",
    "age": 22,
    "course": "IT",
    "gpa": 3.5
  }
  ```
- Response: 
  ```text
  "Student added successfully!"
  ```

### 2. Get All Students (GET)
- URL: `/app/students`
- Method: `GET`
- Response: A list of all students in JSON format.

### 3. Get a Specific Student by ID (GET)
- URL: `/app/students/{id}`
- Method: `GET`
- Parameters: 
  - `id` = Registration Number of the student (e.g., `2021ICT01`)
- Response: A JSON object representing the student with the given ID.

### 4. Update a Student (PUT)
- URL: `/app/students/{id}`
- Method: `PUT`
- Parameters: 
  - `id` = Registration Number of the student (e.g., `2021ICT01`)
- Request Body (JSON):
  ```json
  {
    "name": "Updated Name",
    "age": 23,
    "course": "Computer Science",
    "gpa": 3.7
  }
  ```
- Response: 
  ```text
  "Student updated successfully!"
  ```

### 5. Delete a Student (DELETE)
- URL: `/app/students/{id}`
- Method: `DELETE`
- Parameters: 
  - `id` = Registration Number of the student (e.g., `2021ICT01`)
- Response: 
  ```text
  "Student deleted successfully!"
  ```

### 6. Filter Students by Age (GET)
- URL: `/app/students/age/{min}/{max}`
- Method: `GET`
- Parameters: 
  - `min` = Minimum age
  - `max` = Maximum age
- Response: A list of students whose age is between the specified range.

### 7. Sort Students by GPA (GET)
- URL: `/app/students/sort`
- Method: `GET`
- Response: A list of students sorted by their GPA in descending order.

## Screens
![Screenshot (30)](https://github.com/user-attachments/assets/90218abf-a486-4793-a3dc-06bdfb0a1b4e)
![Screenshot (31)](https://github.com/user-attachments/assets/28e412ba-2dd6-4364-bff3-d9e3cd54a581)
![Screenshot (32)](https://github.com/user-attachments/assets/75a93b8a-ab16-4807-baf6-dca90ec0f4ed)
![Screenshot (33)](https://github.com/user-attachments/assets/59513374-0324-4efa-830c-35399e166199)
![Screenshot (34)](https://github.com/user-attachments/assets/c168ddc7-cb34-46dd-97ed-9d6e14bb0166)
![Screenshot (35)](https://github.com/user-attachments/assets/96a82a42-5115-4b21-8f95-e3c52c3b2e1f)
![Screenshot (36)](https://github.com/user-attachments/assets/f9e46898-cb46-4785-8ebb-4cbba809709d)
![Screenshot (37)](https://github.com/user-attachments/assets/8acda3b7-3434-4f8b-b979-101c5bdc5264)
![Screenshot (38)](https://github.com/user-attachments/assets/d2171afc-3b30-49a1-9a3f-60b855086866)
