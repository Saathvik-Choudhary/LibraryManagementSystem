package com.example.LibraryManagementSystem.library.domain;


import jakarta.persistence.*;

@Entity
@Table (name = "book")
public class Book {

    @Column(name = "author",nullable = false,updatable = false)
    private String author;

    @Column(name = "availability",nullable = false)
    private int availability;

    @Column(name = "bookType",nullable = false,updatable = false)
    private String bookType;

    @Id
    @Column(name = "bookid",nullable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column(name = "ISBN",nullable = false,updatable = false)
    private String iSBN;

    @Column(name = "publisher",nullable = false)
    private String publisher;

    @Column(name = "title",nullable = false,updatable = false)
    private String title;



    // JPA requires a default non-private default constructor
    public Book(){
        super();
    }

    public Book(String author,
                int availability,
                String bookType,
                String isbn,
                String publisher,
                String title) {
        this();
        this.author = author;
        this.availability = availability;
        this.bookType = bookType;
        this.iSBN = isbn;
        this.publisher = publisher;
        this.title = title;
    }


    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL)
    //private Set<Student> holders;


    public String getAuthor() {
        return author;
    }

    public int getAvailability() {
        return availability;
    }

    public String getBookType() {
        return bookType;
    }

    public String getiSBN() {
        return iSBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public Long getbookId(){
        return bookId;
    }

    /**
     * This not required for the project but this can be added in a real world project I guess
     */


}
