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

    public GetBookByISBNResponse getBookByIsbn(final GetBookByISBNRequest request)
    {
        final var response = new GetBookByISBNResponse();

        final var books=bookRepository.findAll();

        for(var book: books)
        {
            if(Objects.equals(book.getiSBN(), request.getiSBN()));
            {
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);
    }

    public GetBookByAuthorResponse getBookByAuthor(final GetBookByAuthorRequest request)
    {
        final var response = new GetBookByAuthorResponse();

        final var books=bookRepository.findAll();

        for(var book: books)
        {
            if(Objects.equals(book.getiSBN(), request.getAuthor()));
            {
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);
    }

    public GetBookByTitleResponse getBookByTitle(final GetBookByTitleRequest request)
    {
        final var response = new GetBookByTitleResponse();

        final var books=bookRepository.findAll();

        for(var book: books)
        {
            if(Objects.equals(book.getiSBN(), request.getTitle()));
            {
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);
    }
}
