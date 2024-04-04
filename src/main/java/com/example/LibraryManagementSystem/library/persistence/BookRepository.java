package com.example.LibraryManagementSystem.library.persistence;

import com.example.LibraryManagementSystem.library.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//based on entity name  spring boot auto wires this repository

// we use find for read operations but we can also use select,get,quere, search

public interface BookRepository extends CrudRepository<Book,Long>  //JpaRepository<Book, Long> {
{
    /**
     * class :Book
     *      table: book
     *  method: finalAll
     *       clause:SELECT
     * return: Iterable Book
     *      caluse:SELECT *
     * now table name is added to the above created mysql quere
     */

    @Override
    Iterable<Book> findAll();


    /**
     * SELECT * FROM book WHERE id=
     * @param id
     * @return the book with the particular id
     */
    @Override
    Optional<Book> findById(Long id);  // optional data type is used when returning null might cause a error
                                       // it represents the absence of a element also
                                       // have to make changes to already created classes in this project to include optional

}
