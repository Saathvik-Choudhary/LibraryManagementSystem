package com.example.LibraryManagementSystem.library.persistence;

import com.example.LibraryManagementSystem.library.Data.BookSummary;
import com.example.LibraryManagementSystem.library.domain.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

//based on entity name  spring boot auto wires this repository

// we use find for read operations but we can also use select,get,quere, search

public interface BookRepository extends CrudRepository<Book,Long>  //JpaRepository<Book, Long> {
{

    //@Query("FROM Book b WHERE b.title = ?1")
    //public Iterable<Book> findBookByTitle(String s);


    /*
    default Collection<Book> findBookByTitle(){
        final Specification<Book> specification=(root ,query,builder)->builder.equal(builder.size(root.get(Book_.title)),1);
        return specification;
    }
     */

    /**
     *  default List<ChemicalElement> finadNuclides(){
     *      final Specification<ChemicalElement> specification =(root ,query, builder)
     *          -> builder.equal(builder.size(root.get(ChemicalElement_.ISOTOPES)), 1)
     */

    //public Optional<Book> findBookByTitleOptional(String s);

    /**
    /**
     * class :Book
     *      table: book
     *  method: finalAll
     *       clause:SELECT
     * return: Iterable Book
     *      caluse:SELECT *
     * now table name is added to the above created mysql quere


    @Override
    @Query(value = "From Book b",)
    Iterable<Book> findAll();


    /**
     * SELECT * FROM book WHERE id=
     * @param id
     * @return the book with the particular id

    @Override
    Optional<Book> findById(Long id);  // optional data type is used when returning null might cause a error
                                       // it represents the absence of a element also
                                       // have to make changes to already created classes in this project to include optional
    */
}
