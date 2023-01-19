// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Student class of the program. It allows creating student entires in the system.

package com.assessmentoop;

public class Student extends Person {

    // Instance Variables
    private static int studentCounter;
    private String studentID;
    private String sAddress;
    private String sNumber;
    private String sStatus;


    // Constructor
    public Student(String firstName, String lastName, String dob, String address, String number, String status) {
        super(firstName, lastName, dob);
        this.studentID = String.format("%02d", ++studentCounter);
        this.sAddress = address;
        this.sNumber = number;
        this.sStatus = status;
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

    public String getStudentID() {
        return studentID;
    }

    public String getsAddress() {
        return sAddress;
    }

    public String getsNumber() {
        return sNumber;
    }

    public String getsStatus() {
        return sStatus;
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

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }


    // toString method to show the Student content
    @Override
    public String toString() {
        return "Student{" +
                " studentID='" + studentID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", sNumber='" + sNumber + '\'' +
                ", sStatus='" + sStatus + '\'' +
                '}';
    }
}
