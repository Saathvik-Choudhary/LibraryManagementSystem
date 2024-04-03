package com.example.LibraryManagementSystem.library.Data;

public class GetBookRequestByAuthor {

    private final String author;
    public GetBookRequestByAuthor(final String author ) {

        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

}
