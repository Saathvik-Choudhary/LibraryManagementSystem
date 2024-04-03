package com.example.LibraryManagementSystem.library.Data;

import jakarta.persistence.Column;

public class BookSummary {

    private final String author;

    private final String iSBN;

    private final String title;

    private final Long bookId;

    public BookSummary(String author, String iSBN, String title) {
        this.author = author;
        this.iSBN = iSBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getiSBN() {
        return iSBN;
    }

    public String getTitle() {
        return title;
    }
}
