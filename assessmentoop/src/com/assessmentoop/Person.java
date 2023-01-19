// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Person class of the program. It collects personal information of each person registered to the system.

package com.assessmentoop;

public abstract class Person {

    // Instance Variables
    protected String firstName;
    protected String lastName;
    protected String dob;


    // Constructor
    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    // Abstract methods
    // Getters
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getDob();


    // Setters
    public abstract void setFirstName(String firstName);
    public abstract void setLastName(String lastName);
    public abstract void setDob(String dob);
}
