// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the IRole interface class of the program. It allows giving the role to the teacher.

package com.assessmentoop;

public interface IRole {

    // Methods
    public String getRole();
    public void setRole(String role);
}
