package com.example.LibraryManagementSystem.library.persistence;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;


@Repository
public class BookTablePopulator implements CommandLineRunner {


    @Autowired
    BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {}


}
