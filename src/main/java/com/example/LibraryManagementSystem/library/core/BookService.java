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


    /**
     *      in findall we shpuld add RequestPage(0,100)
     */

    // response entity represents a http response

    /**
     *      return response.ok()? response.:ResponseEntity.ok(response):ResponseEntity.badRequest().body();
     *      use this to check and return an error or the correct required response
     *
     *      ResponseEntity defines a http response which is given by the API
     *
     *      Whenever the caller is adding details into the repository we also need to send a
     *      response containing all the details entered by the user
     *
     *
     *      RequestEntity.ok()
     *      RequestEntity.status(HttpStatus.CREATED).body(response)
     *      ResponseEntity.badRequest().body(response)    // bad request also sends a proper response to the user
     *      Check out all the ResponseEntity. functions that are available
     *
     *
     *      What is the difference betwen GetMapping and PostMApping
     *
     *
     *
     *      Return statements based on the request type
     *
     * Request types:-
     *      -> get
     *          ResponseEntity.ok()
     *          ResponseEntity.notfound
     *
     *      -> save
     *          ResponseEntity.ok
     *          ResponseEntity.badrequest
     *          ResponseEntity.notfound
     *          ResponseEntity.saved
     *
     *      -> async
     *          ResponseEntity.accepted
     *
     *
     ****************************************************************************************************************************************************************
     *      Asynchronous request processing
     *
     *
     *      Thread.sleep(); //this can be used to delay the thread before returning the result from the call
     *
     *
     *      when we are using multiple sleeps then try to use parallel calls so that the number of calls won't compound the required time
     *      ^
     *      | the above line is achieved by using @Async annotation in spring boot
     *                          return services.parallelstream() instead of services.stream()
     *
     *
     *      ResponseEntity.accepted().build() is used whenever we are working with @Async annotation
     *
     ****************************************************************************************************************************************************************
     */


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
