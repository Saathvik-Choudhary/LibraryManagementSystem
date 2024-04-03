package com.example.LibraryManagementSystem.library.Data;

import jakarta.persistence.Column;

public class BookSummary {

    private final String author;

    private final String iSBN;

    private final String title;

    private final Long bookId;

    public BookSummary(final String author,final String iSBN,final String title,final Long bookId) {
        this.author = author;
        this.iSBN = iSBN;
        this.title = title;
        this.bookId=bookId;
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

    public Long getBookId() {
        return bookId;
    }
}
