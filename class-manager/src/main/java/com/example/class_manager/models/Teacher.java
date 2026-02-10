package com.example.class_manager.models;

public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private String subject;


    public Teacher(int id, String firstName, String lastName, String subject) {
        this.id = id;
        this.firstName = firstName;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
