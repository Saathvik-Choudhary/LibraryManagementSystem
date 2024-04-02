package com.example.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;


    public void create(Books book){
        booksRepository.save(book);
    }

    public void delete(Long id){
        booksRepository.deleteById(id);
    }

    public void update(Books book)
    {
        booksRepository.save(book);
    }

    public void read(Long id)
    {
        booksRepository.findById(id);
    }



}
