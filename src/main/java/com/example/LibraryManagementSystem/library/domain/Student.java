package com.example.LibraryManagementSystem.library.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * No need to add age in the column instead we are gonna calculate the age when required
 *
 * @Column(name = "age",nullable = false)
private int age=Period.between( getDob(), LocalDate.now()).getYears();
 */


@Entity
@Table(name = "students")
public class Student {
    @Column(name = "name",nullable = false,updatable = false)
    private String name;

    @Column(name = "dob",nullable = false,updatable = false)
    private LocalDate dob;

    @Id
    @Column(name = "studentId",nullable = false,updatable = false)
    private String studentId;

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }


}


















/**
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
 */