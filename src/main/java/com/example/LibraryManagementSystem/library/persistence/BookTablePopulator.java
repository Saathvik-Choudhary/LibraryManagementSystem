package com.example.LibraryManagementSystem.library.persistence;
import com.example.LibraryManagementSystem.library.domain.Book;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookTablePopulator implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;
    private void populateBooks() {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Book book = new Book("author"+i,
            1,
                    "bookType"+i,
            "isbn"+i,
            "publisher"+i,
            "title");
            // You can set other properties as needed
            books.add(book);
        }
        bookRepository.saveAll(books);
        System.out.println("Books populated successfully!");
    }

    @Override
    public void run(String... args) throws Exception {
        populateBooks();
    }
}