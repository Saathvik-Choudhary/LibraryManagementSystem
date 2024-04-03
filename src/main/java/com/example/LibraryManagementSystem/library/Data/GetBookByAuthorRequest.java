package com.example.LibraryManagementSystem.library.Data;

public class GetBookByAuthorRequest {

    private final String author;
    public GetBookByAuthorRequest(final String author ) {

        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

}
