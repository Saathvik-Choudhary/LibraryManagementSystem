package com.example.LibraryManagementSystem;


import jakarta.persistence.*;

@Entity
@Table (name = "books")
public class Book {

    @Column(name = "isbm",nullable = false,updatable = false)
    private String isbn;

    @Column(name = "title",nullable = false,updatable = false)
    private String title;

    @Column(name = "author",nullable = false,updatable = false)
    private String author;

    @Column(name = "availability",nullable = false)
    private int availability;

    @Column(name = "bookType",nullable = false,updatable = false)
    private String bookType;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL)
    //private Set<Student> holders;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailability() {
        return availability;
    }

    public String getBookType() {
        return bookType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
