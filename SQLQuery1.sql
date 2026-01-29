CREATE DATABASE studentdb;
GO
USE studentdb;

CREATE TABLE students (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100),
    email NVARCHAR(100),
    phone NVARCHAR(20),
    class_name NVARCHAR(50)
);

TRUNCATE TABLE students;




