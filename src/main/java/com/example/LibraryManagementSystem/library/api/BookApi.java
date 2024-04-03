package com.example.LibraryManagementSystem.library.api;

import com.example.LibraryManagementSystem.library.core.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/books")
@RestController
public class BookApi {


    private BookService bookService;

/*
    @GetMapping(??)
    public ResponseEntity<?> getBooks(@PathVariable ??)
    {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

 */
}
