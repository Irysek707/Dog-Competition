// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Admin class of the program. It allows to create an Admin account and use password to logg in.

package com.assessmentoop;

public class Admin {

    // Instance Variables
    private static int adminCounter = 0;
    private String aID;
    private String username;
    private String password;


    // Constructor
    public Admin(String username, String password) {
        this.aID = String.format("%02d", ++adminCounter);
        this.username = username;
        this.password = password;
    }


    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // toString method to show the admin content
    @Override
    public String toString() {
        return "Admin{" +
                "aID='" + aID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
