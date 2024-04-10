package com.example.LibraryManagementSystem.library.core;

import com.example.LibraryManagementSystem.library.Data.*;
import com.example.LibraryManagementSystem.library.domain.Book;
import com.example.LibraryManagementSystem.library.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public GetBookByTitleResponse getBookByTitle(final GetBookByTitleRequest request)
    {
        final var response=new GetBookByTitleResponse();
        /*
        final var result = bookRepository.findBookByTitle(request.getTitle());


        for(var book:result) {
            response.addBook(new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId()));
        }

        return (response);
         */


        final var books=bookRepository.findAll();

        for(var book: books) {
            if(Objects.equals(book.getTitle(), request.getTitle())){
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);

    }

    public GetBookByISBNResponse getBookByIsbn(final GetBookByISBNRequest request) {
        final var response = new GetBookByISBNResponse();

        final var books=bookRepository.findAll();

        for(var book: books) {
            if(Objects.equals(book.getiSBN(), request.getiSBN())){
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);
    }

    public GetBookByAuthorResponse getBookByAuthor(final GetBookByAuthorRequest request) {
        final var response = new GetBookByAuthorResponse();

        final var books=bookRepository.findAll();

        for(var book: books) {
            if(Objects.equals(book.getiSBN(), request.getAuthor())){
                BookSummary bookToAdd=new BookSummary(book.getAuthor(),book.getiSBN(),book.getTitle(),book.getbookId());
                response.addBook(bookToAdd);
            }
        }
        return(response);
    }

    /*
    all the problems that he user makes while data input should be returned at teh same time to the user
    not one by one.
     the user should also be informed why the particular input is invalid.
     this can be achieved by proper invalid message.
     */


    /**
     * use can also write a custom annotation to ensue that validation is being handled by the annotation itself
     */

    /**
     * final var validation=request.validate();
     *
     * respone.adderrors(validation)
     * if(validation!=null)
     * return(response)
     */
}
