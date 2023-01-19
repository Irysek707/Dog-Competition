// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Category class of the program. It allows creating and using category of the competition.

package com.assessmentoop;

public class Category {

    // Instance variables
    private static int categoryNumber = 0;
    private String categoryID;
    private String categoryName;


    // Constructor
    public Category(String name) {
        this.categoryID = String.format("%02d", ++categoryNumber);
        this.categoryName = name;
    }


    // Getters
    public String getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }


    // Setters
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    // toString method to show the category content
    @Override
    public String toString() {
        return "Category{" +
                "categoryID='" + categoryID + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
