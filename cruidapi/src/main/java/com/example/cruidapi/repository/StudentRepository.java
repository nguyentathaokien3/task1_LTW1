package com.example.cruidapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruidapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
