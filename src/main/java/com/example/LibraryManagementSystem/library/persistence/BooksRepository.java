package com.example.LibraryManagementSystem.library.persistence;

import com.example.LibraryManagementSystem.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book,Long>  //JpaRepository<Book, Long> {
{}
