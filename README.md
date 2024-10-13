# Quiz Backend - Spring Boot

## Overview

This is a backend project built with **Spring Boot** that provides a RESTful API for a quiz management system. The application allows users to manage quiz questions, create quizzes, and calculate quiz results.

## Features

- **Question Management**: Add, update, delete, and retrieve quiz questions.
- **Quiz Creation**: Create and manage quizzes using available questions.
- **Quiz Execution**: Users can attempt quizzes, and the system will calculate the score based on the answers.
- **Result Calculation**: After submitting the quiz, the system calculates the total score.

## API Endpoints

### Question Management
| Method   | URL   | Description |
| -------- | --------------------------- |---------------------------------|
| `GET`    | `/api/allquestions`         | Retrieve all questions.         |
| `GET`    | `/api/category/{category}`  | Retrieve questions by category. |
| `POST`   | `/api/addquestion`          | Add a new question.             |
| `PUT`    | `/api/updatequestion/{i}`   | Update a question.              |
| `DELETE` | `/api/deletequestion/{i}`   | Delete a question.              |


### Quiz Management
| Method   | URL   | Description |
| -------- | --------------------------- |---------------------------------|
| `POST`   | `/quiz/create`              | Create a new quiz.              |
| `GET`    | `/get/{id}`                 | Retrieve quiz questions.        |
| `DELETE` | `/quiz/submit/{id}`         | Submit the ans and get results.  |


## Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - For database access and management
- **Postgresql** - Database for development and testing (can be replaced with any relational database)
- **RESTful API** - For exposing endpoints
- **Lombok** - To reduce boilerplate code
- **Maven** - Dependency management and build tool

## Setup and Installation

1. Clone the repository:
   ```
   git clone https://github.com/koley2000/quiz.git
   ```
2. Navigate to the project directory

3. Edit the database details in application.properties. 

4. Now run the Spring Boot projects. 
