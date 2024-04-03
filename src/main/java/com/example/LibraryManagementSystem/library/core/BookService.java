package com.example.LibraryManagementSystem.library.core;

import com.example.LibraryManagementSystem.library.Data.*;
import com.example.LibraryManagementSystem.library.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    
    public GetBooksResponseByISBN getBookByIsbn(final GetBookRequestByISBN request)
    {
        final var response = new GetBooksResponseByISBN();

        final var books=bookRepository.findAll();

        for(var i: books)
        {
            if(Objects.equals(i.getiSBN(), request.getiSBN()));
            {
                BookSummary book=new BookSummary(i.getAuthor(),i.getiSBN(),i.getTitle());
                response.addBook(book);
            }
        }
        return(response);
    }

    public GetBookResponseByAuthor getBookByAuthor(final GetBookRequestByAuthor request)
    {
        final var response = new GetBookResponseByAuthor();

        final var books=bookRepository.findAll();

        for(var i: books)
        {
            if(Objects.equals(i.getiSBN(), request.getAuthor()));
            {
                BookSummary book=new BookSummary(i.getAuthor(),i.getiSBN(),i.getTitle());
                response.addBook(book);
            }
        }
        return(response);
    }

    public GetBookResponseByTitle getBookByAuthor(final GetBookRequestByTitle request)
    {
        final var response = new GetBookResponseByTitle();

        final var books=bookRepository.findAll();

        for(var i: books)
        {
            if(Objects.equals(i.getiSBN(), request.getTitle()));
            {
                BookSummary book=new BookSummary(i.getAuthor(),i.getiSBN(),i.getTitle());
                response.addBook(book);
            }
        }
        return(response);
    }
}
