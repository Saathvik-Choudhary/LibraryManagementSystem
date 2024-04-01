package com.example.LibraryManagementSystem;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Borrower {

    private final String name;

    private final LocalDate dob;

    private final String uniqueStudentId;

    private int age;

    public Student(String name, LocalDate dob, String uniqueStudentId) {
        this.name = name;
        this.dob = dob;
        this.uniqueStudentId = uniqueStudentId;
    }

    public String getUniqueStudentId() {
        return uniqueStudentId;
    }

    @Override
    public void updateAge() {
        this.age= Period.between( this.dob, LocalDate.now()).getYears();
    }
}
