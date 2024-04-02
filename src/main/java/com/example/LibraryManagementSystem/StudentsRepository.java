package com.example.LibraryManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student,Long> {
}
