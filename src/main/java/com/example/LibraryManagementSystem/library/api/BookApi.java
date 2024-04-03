package com.example.LibraryManagementSystem.library.api;

import com.example.LibraryManagementSystem.library.core.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public class BookApi {


    private BookService bookService;


    @GetMapping
    public ResponseEntity<?> getBooks()
    {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
