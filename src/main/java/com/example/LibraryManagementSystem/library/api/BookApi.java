package com.example.LibraryManagementSystem.library.api;

import com.example.LibraryManagementSystem.library.Data.*;
import com.example.LibraryManagementSystem.library.core.BookService;
import com.example.LibraryManagementSystem.library.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RequestMapping("/books")       // sets the local host web path
@RestController //defines that this is a controller
class BookAPI {
    @Autowired // adding service functions to controller
    private BookService bookService;

    /**
     * Gets books matching certain criteria.
     */

    @GetMapping("/title/{title}") // service to web with controller intermediate
    public ResponseEntity<GetBookByTitleResponse> getBooksByTitle(@PathVariable final String title) {
        return ResponseEntity.ok(bookService.getBookByTitle(new GetBookByTitleRequest(title)));
    }


    @GetMapping("/author/{author}") // service to web with controller intermediate
    public ResponseEntity<GetBookByAuthorResponse> getBooksByAuthor(final String Author) {
        return ResponseEntity.ok(bookService.getBookByAuthor(new GetBookByAuthorRequest(Author)));
    }


    @GetMapping("/ISBN") // service to web with controller intermediate
    public ResponseEntity<GetBookByISBNResponse> getBooksByISBN(final String iSBN) {
        return ResponseEntity.ok(bookService.getBookByIsbn(new GetBookByISBNRequest(iSBN)));
    }


    /** .
     * // the attributes names used in JPQL are the java attributes names not sql table names
     @Override
     *   @Query("FROM Book b WHERE b.isbn = ?1")  //this query is written in JPQL custom
     *   Optional<Book> findAll(String s);
     *
     * @Query ("    SELECT e.isotope
     *      FROM ChemicalElements e
     *      WHERE e.atomicNumber =?1")       // ?1 defines that it is the first number inside the function bracket
     *      List<ChemicalIsotopes> findIsotopesByAtomicNumber (int atomicNumber)
     *
     *
     * @Query (NativeQuery = true/false             //when false you write jpql and when true you write MYSQL query
     *          value = "Your query")
     *
     *
     * Always consider teh number of entities are present in the real world
     * Always write an optimum sql query
     *
     */

    /**
     * Never use query annotation instead use specification which will let you write dynamic queries
     * .
     * Queries are not type safe so there can be a clerical error in it which can't be detected by ide
     */


    /**
     *  default List<ChemicalElement> finadNuclides(){
     *      final Specification<ChemicalElement> specification =(root ,query, builder)
     *          -> builder.equal(builder.size(root.get(ChemicalElement_.ISOTOPES)), 1)
     */

    /**
     * pagination is the process of splitting the retrieval process of data into pages
     *
     * generally in each page you can set three things :- page number, sort, and size
     */

}
