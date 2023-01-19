// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the ILadder interface class of the program. It allows adding and deleting points.

package com.assessmentoop;

public interface ILadder {

    // Methods
    public int addPoints(int points);
    public double addPoints(double points);
    public int deletePoints(int points);
    public double deletePoints(double points);
}
