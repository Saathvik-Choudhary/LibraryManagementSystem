package com.example.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;


    public void create(Book book){
        booksRepository.save(book);
    }

    public void delete(Long id){
        booksRepository.deleteById(id);
    }

    public void update(Book book)
    {
        booksRepository.save(book);
    }

    public void read(Long id)
    {
        booksRepository.findById(id);
    }



}
