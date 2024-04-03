package com.example.LibraryManagementSystem.library.persistence;

import com.example.LibraryManagementSystem.library.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
}
