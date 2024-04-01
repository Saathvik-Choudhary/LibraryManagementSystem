package com.example.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Book {

    String authorName = null;
    String isbn = null;
    String title = null;
    int availability = 0;

    Map<String,Person> holders=new HashMap<>();


    public int getAvailability();

    public void setAvailability(int availability);

    public Person getHolders(final String uniquePersionId);

    public void setHolders(final Person person,final String uniquePersonId);

}
