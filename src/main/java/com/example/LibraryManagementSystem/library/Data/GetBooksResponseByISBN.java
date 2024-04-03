package com.example.LibraryManagementSystem.library.Data;


import com.example.LibraryManagementSystem.library.domain.Book;

import java.util.ArrayList;
import java.util.Collection;

public class GetBooksResponseByISBN {

    private Collection<BookSummary> books;

    public void addBook(final BookSummary book) {
        if (books == null) {
            books = new ArrayList<>();
        }

        books.add(book);
    }

    public Collection<BookSummary> getBooks()
    {
        return books;
    }
}
