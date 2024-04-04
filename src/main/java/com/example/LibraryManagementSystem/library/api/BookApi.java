package com.example.LibraryManagementSystem.library.api;

import com.example.LibraryManagementSystem.library.Data.*;
import com.example.LibraryManagementSystem.library.core.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/books")       // sets the local host web path
@RestController //defines that this is a controller
class BookAPI {
    @Autowired // adding service functions to controller
    private BookService bookService;

    /**
     * Gets books matching certain criteria.
     */
    @GetMapping("/title") // service to web with controller intermediate
    public ResponseEntity<GetBookByTitleResponse> getBooksByTitle( final String title) {
        return ResponseEntity.ok(bookService.getBookByTitle(new GetBookByTitleRequest(title)));
    }


    @GetMapping("/author") // service to web with controller intermediate
    public ResponseEntity<GetBookByAuthorResponse> getBooksByAuthor(final String Author) {
        return ResponseEntity.ok(bookService.getBookByAuthor(new GetBookByAuthorRequest(Author)));
    }


    /*
    @GetMapping // service to web with controller intermediate
    public ResponseEntity<GetBookByISBNResponse> getBooksByISBN(final String iSBN) {
        return ResponseEntity.ok(bookService.getBookByIsbn(new GetBookByISBNRequest(iSBN)));
    }

     */
}
