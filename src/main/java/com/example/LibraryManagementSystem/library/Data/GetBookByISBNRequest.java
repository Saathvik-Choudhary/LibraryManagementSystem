package com.example.LibraryManagementSystem.library.Data;

public class GetBookByISBNRequest {
    private final String iSBN;
    public GetBookByISBNRequest(final String iSBN ) {
        this.iSBN = iSBN;
    }

    public String getiSBN() {
        return this.iSBN;
    }

}
