package com.example.LibraryManagementSystem.library.core;

import com.example.LibraryManagementSystem.library.domain.Book;
import com.example.LibraryManagementSystem.library.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private final var books=bookRepository.findAll();
    public void getBookByIsbn(final String iSBM )
    {
        for(var i: books)
        {
            
        }
    }

    public void putBook()
    {

    }

    public void updateBook()
    {

    }


}
