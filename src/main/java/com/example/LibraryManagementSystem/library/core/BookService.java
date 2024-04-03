package com.example.LibraryManagementSystem.library.core;

import com.example.LibraryManagementSystem.library.domain.Book;
import com.example.LibraryManagementSystem.library.persistence.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BooksRepository bookRepository;


    public void getBooks()
    {

    }


    public void create(Book book){
        bookRepository.save(book);
    }

    public void delete(Long id){
        bookRepository.deleteById(id);
    }

    public void update(Book book)
    {
        bookRepository.save(book);
    }

    public void read(Long id)
    {
        bookRepository.findById(id);
    }



}
