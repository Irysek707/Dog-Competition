// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Teacher class of the program. It allows creating teacher entries in the system.

package com.assessmentoop;

public class Teacher extends Person implements ILadder, IRole {

    // Instance Variables
    private static int teacherCounter = 0;
    private String tID;
    private String tAddress;
    private String tNumber;
    private String tRole;
    private int tScore;
    private double tScoreD;

    // Constructor
    public Teacher(String firstName, String lastName, String dob, String address, String contact, String role) {
        super(firstName, lastName, dob);
        this.tID = String.format("%02d", ++teacherCounter);
        this.tAddress = address;
        this.tNumber = contact;
        this.tRole = role;
        this.tScore = 0;
        this.tScoreD = 0.0;
    }


    // Getters
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getDob() {
        return dob;
    }

    public String gettID() {
        return tID;
    }

    public String gettAddress() {
        return tAddress;
    }

    public String gettNumber() {
        return tNumber;
    }

    public String gettRole() {
        return tRole;
    }


    // Setters
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setDob(String dob) {
        this.dob = dob;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }


    // Getters and Setters from IRole interface
    @Override
    public String getRole() {
        return tRole;
    }

    @Override
    public void setRole(String role) {
        this.tRole = role;
    }


    // Getters and Setters from ILadder interface
    @Override
    public int addPoints(int points) {
        return this.tScore = points;
    }

    @Override
    public double addPoints(double points) {
        return this.tScoreD = points;
    }

    @Override
    public int deletePoints(int points) {
        return this.tScore = points;
    }

    @Override
    public double deletePoints(double points) {
        return this.tScoreD = points;
    }


    // toString method to show the Teacher content
    @Override
    public String toString() {
        return "Teacher{" +
                " tID='" + tID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", tAddress='" + tAddress + '\'' +
                ", tNumber='" + tNumber + '\'' +
                ", tRole='" + tRole + '\'' +
                '}';
    }
}
