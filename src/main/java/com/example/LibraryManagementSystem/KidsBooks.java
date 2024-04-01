package com.example.LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class KidsBooks implements Book{

    private final String authorName;
    private final String isbn;
    private final String title;
    int availability = 0;
    Map<String,Person> holders=new HashMap<>();

    @Override
    public int getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public KidsBooks(final String authorName,final String isbn,final String title,final int availability) {
        this.authorName = authorName;
        this.isbn = isbn;
        this.title = title;
        this.availability = availability;
    }

    @Override
    public Person getHolders(final String uniquePersionId) {
        return (this.holders.get(uniquePersionId));
    }

    @Override
    public void setHolders(final Person person,final String uniquePersonId) {
        this.holders.put(uniquePersonId,person);
    }
}
