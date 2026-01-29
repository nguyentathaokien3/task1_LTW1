package com.example.cruidapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruidapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Tìm theo tên (LIKE %name%)
    List<Student> findByNameContainingIgnoreCase(String name);
}
