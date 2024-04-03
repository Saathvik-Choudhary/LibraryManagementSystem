package com.example.LibraryManagementSystem.library.persistence;

import com.example.LibraryManagementSystem.library.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>  //JpaRepository<Book, Long> {
{}
