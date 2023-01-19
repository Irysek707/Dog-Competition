// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Team class of the program. It allows creating teams using existing teachers and students.

package com.assessmentoop;

public class Team {

    // Instance Variables
    private static int teamCounter = 0;
    private String teamID;
    private String categoryName;
    private String collegeName;
    private String coachName;
    private String student1;
    private String student2;
    private String student3;
    private String student4;
    private String teamScore;


    // Constructor
    public Team(Category category, Teacher coach, String collegeName, Student student1, Student student2, Student student3, Student student4, String teamScore) {
        this.teamID = String.format("%02d", ++teamCounter);
        this.categoryName = category.getCategoryName();
        this.collegeName = collegeName;
        this.coachName = coach.getFirstName() + " " + coach.getLastName();
        this.student1 = student1.getFirstName() + " " + student1.getLastName();
        this.student2 = student2.getFirstName() + " " + student2.getLastName();
        this.student3 = student3.getFirstName() + " " + student3.getLastName();
        this.student4 = student4.getFirstName() + " " + student4.getLastName();
        this.teamScore = teamScore;
    }


    // Getters
    public String getTeamID() {
        return teamID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getStudent1() {
        return student1;
    }

    public String getStudent2() {
        return student2;
    }

    public String getStudent3() {
        return student3;
    }

    public String getStudent4() {
        return student4;
    }

    public String getTeamScore() {
        return teamScore;
    }


    // Setters
    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setStudent1(String student1) {
        this.student1 = student1;
    }

    public void setStudent2(String student2) {
        this.student2 = student2;
    }

    public void setStudent3(String student3) {
        this.student3 = student3;
    }

    public void setStudent4(String student4) {
        this.student4 = student4;
    }

    public void setTeamScore(String teamScore) {
        this.teamScore = teamScore;
    }


    // toString method to show the Team content
    @Override
    public String toString() {
        return "Team{" +
                "teamID='" + teamID + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", coachName='" + coachName + '\'' +
                ", student1='" + student1 + '\'' +
                ", student2='" + student2 + '\'' +
                ", student3='" + student3 + '\'' +
                ", student4='" + student4 + '\'' +
                ", teamScore='" + teamScore + '\'' +
                '}';
    }
}
