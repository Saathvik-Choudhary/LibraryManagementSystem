package com.example.LibraryManagementSystem.library.Data;

public class GetBookByTitleRequest {

    private final String title;

    public GetBookByTitleRequest(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
