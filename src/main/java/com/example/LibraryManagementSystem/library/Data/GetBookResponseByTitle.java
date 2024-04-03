package com.example.LibraryManagementSystem.library.Data;

import java.util.ArrayList;
import java.util.Collection;

public class GetBookResponseByTitle {
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
