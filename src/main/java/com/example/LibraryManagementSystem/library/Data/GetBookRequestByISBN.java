package com.example.LibraryManagementSystem.library.Data;

public class GetBookRequestByISBN {
    private final String iSBN;
    public GetBookRequestByISBN(final String iSBN ) {
        this.iSBN = iSBN;
    }

    public String getiSBN() {
        return this.iSBN;
    }

}
