package com.example.LibraryManagementSystem.library.Data;

public class GetBookRequestByTitle {

    private final String title;

    public GetBookRequestByTitle(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
