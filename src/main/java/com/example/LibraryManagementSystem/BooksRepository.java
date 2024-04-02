package com.example.LibraryManagementSystem;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
