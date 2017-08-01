package com.example.demo;

public class Student {
    // FIELDS
    private String firstName;
    private String lastName;
    private Grade grade;

    // CONSTRUCTORS
    public Student() {
    }

    // METHODS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
