// Assessment for Software Development: Object Oriented Programming H17135/037
// Location: Edinburgh College
// Date: 27 April 2022
// Student ID: EC1842981
// Student Name: Anna Podlasek
// Tutor: Jorge Miguel Dos Santos Correia
// Notes: Program allows logging in to the system, adding teachers (giving them roles), students and dividing them into groups. Each group competes in different category and gets points from the judges.
// This is the Main class of the program.

package com.assessmentoop;

public class Main {

    public static void main(String[] args) {

        // Variables
        String username;
        String password;
        String scoreBoard = "0.0";
        double score = 0.0;
        int points;
        double pointsD;

        // Teacher roles and student statuses
        String[] teacherRole = {"Coach", "Judge"};
        String[] studentStatus = {"Part-time", "Full-time", "Apprentice"};

        // Adding a new Admin
        Admin admin = new Admin("APodlasek", "superHardPassword123");
        System.out.println(" ");
        System.out.println("***********************************************");
        System.out.println(" ");
        System.out.println(admin.toString());

        // Login into the system
        username = "APodlasek";
        password = "superHardPassword123";

        // Check user credentials
        boolean userExists = checkUserCredentials(username, password, admin);

        // Check if the user exists
        if (userExists) {
            System.out.println("You successfully logged in!");
        }
        else {
            System.out.println("Wrong username or password. Please try again!");
        }

        System.out.println(" ");
        System.out.println("***********************************************");
        System.out.println(" ");

        // Adding new Teachers
        System.out.println("Teachers registered for the competition:");

        Teacher teacher1 = new Teacher("John", "Smith", "20-06-1990", "Edinburgh", "01315398237", teacherRole[0]);
        System.out.println(teacher1.toString());

        Teacher teacher2 = new Teacher("Sarah", "Jane", "12-04-1989", "Glasgow", "01319034829", teacherRole[0]);
        System.out.println(teacher2.toString());

        Teacher teacher3 = new Teacher("River", "Song", "19-05-1979", "Aberdeen", "01319832739", teacherRole[0]);
        System.out.println(teacher3.toString());

        Teacher teacher4 = new Teacher("Jane", "Doe", "14-04-1979", "Manchester", "01920374829", teacherRole[1]);
        System.out.println(teacher4.toString());

        Teacher teacher5 = new Teacher("Joseph", "Novak", "10-05-1970", "London", "01302934829", teacherRole[1]);
        System.out.println(teacher5.toString());
        System.out.println("");

        // Adding new Students
        System.out.println("Students registered for the competition:");

        Student student1 = new Student("Anna", "Podlasek", "30-06-1994", "Edinburgh", "07949216347", studentStatus[1]);
        System.out.println(student1.toString());

        Student student2 = new Student("Martha", "Jones", "10-12-1999", "Edinburgh", "07949234875", studentStatus[1]);
        System.out.println(student2.toString());

        Student student3 = new Student("Jack", "Harkness", "30-07-1980", "Edinburgh", "07156346347", studentStatus[0]);
        System.out.println(student3.toString());

        Student student4 = new Student("Rose", "Tyler", "23-03-1995", "Edinburgh", "07949093457", studentStatus[2]);
        System.out.println(student4.toString());

        Student student5 = new Student("Donna", "Noble", "10-03-1985", "Glasgow", "07993743457", studentStatus[2]);
        System.out.println(student5.toString());

        Student student6 = new Student("Amy", "Pond", "11-08-1990", "Glasgow", "07975036457", studentStatus[1]);
        System.out.println(student6.toString());

        Student student7 = new Student("Rory", "Williams", "29-11-1991", "Glasgow", "07094123457", studentStatus[1]);
        System.out.println(student7.toString());

        Student student8 = new Student("Clara", "Oswald", "30-01-1999", "Glasgow", "07392093457", studentStatus[0]);
        System.out.println(student8.toString());

        Student student9 = new Student("Bill", "Potts", "01-01-1991", "Aberdeen", "07990274957", studentStatus[2]);
        System.out.println(student9.toString());

        Student student10 = new Student("Yasmin", "Khan", "21-08-1996", "Aberdeen", "07975193527", studentStatus[1]);
        System.out.println(student10.toString());

        Student student11 = new Student("Graham", "O'Brien", "25-11-1999", "Aberdeen", "07010364457", studentStatus[1]);
        System.out.println(student11.toString());

        Student student12 = new Student("Ryan", "Sinclair", "30-05-1989", "Aberdeen", "08201793457", studentStatus[0]);
        System.out.println(student12.toString());
        System.out.println("");

        // Adding new Categories
        System.out.println("Categories available in the competition:");

        Category category1 = new Category("Software Development");
        System.out.println(category1.toString());

        Category category2 = new Category("Networking");
        System.out.println(category2.toString());

        Category category3 = new Category("Web Design");
        System.out.println(category3.toString());
        System.out.println("");

        // Adding new Teams to the competition
        System.out.println("Teams participating in the competition:");

        Team team1 = new Team(category1, teacher1, "Edinburgh College", student1, student2, student3, student4, scoreBoard);
        System.out.println(team1.toString());

        Team team2 = new Team(category2, teacher2, "Glasgow College", student5, student6, student7, student8, scoreBoard);
        System.out.println(team2.toString());

        Team team3 = new Team(category3, teacher3, "Aberdeen College", student9, student10, student11, student12, scoreBoard);
        System.out.println(team3.toString());
        System.out.println("");


        // Adding points to the scoreboards of different teams.
        System.out.println("***********************************************");
        System.out.println(" ");
        System.out.println("Competition Scoreboard!");
        System.out.println(" ");
        System.out.println("***********************************************");
        System.out.println("\n");

        // TEAM 1
        // A judge 1 scoring team 1 (with integer points)
        System.out.println(team1.toString());
        System.out.println("");
        points = 10;
        // Checking for negative values
        try {
            scoreCheck(points);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            points = 0;
        }
        score += teacher4.addPoints(points);
        scoreBoard = Double.toString(score);
        team1.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher4.getFirstName() + " " + teacher4.getLastName() + " scored " + points +  " to Team " + team1.getTeamID() + " from " + team1.getCollegeName() + ".");
        System.out.println("Team " + team1.getTeamID() + " from " + team1.getCollegeName() + " has " + team1.getTeamScore() + " points.");
        System.out.println("");

        // A judge 2 scoring team 1 (with decimal points)
        pointsD = 9.5;
        // Checking for negative values
        try {
            scoreCheckD(pointsD);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            pointsD = 0;
        }
        score += teacher5.addPoints(pointsD);
        scoreBoard = Double.toString(score);
        team1.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher5.getFirstName() + " " + teacher5.getLastName() + " scored " + pointsD + " to Team " + team1.getTeamID() + " from " + team1.getCollegeName() + ".");
        System.out.println("Team " + team1.getTeamID() + " from " + team1.getCollegeName() + " has " + team1.getTeamScore() + " points.");
        System.out.println(" ");
        System.out.println("*********");
        System.out.println(" ");


        // TEAM 2
        // A judge 1 scoring team 2 (with integer points)
        //Resetting score
        score = 0.0;
        System.out.println(team2.toString());
        System.out.println("");
        points = 5;
        // Checking for negative values
        try {
            scoreCheck(points);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            points = 0;
        }
        score += teacher4.addPoints(points);
        scoreBoard = Double.toString(score);
        team2.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher4.getFirstName() + " " + teacher4.getLastName() + " scored " + points +  " to Team " + team2.getTeamID() + " from " + team2.getCollegeName() + ".");
        System.out.println("Team " + team2.getTeamID() + " from " + team2.getCollegeName() + " has " + team2.getTeamScore() + " points.");
        System.out.println("");

        // A judge 2 scoring team 2 (with integer points)
        points = 8;
        // Checking for negative values
        try {
            scoreCheck(points);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            points = 0;
        }
        score += teacher5.addPoints(points);
        scoreBoard = Double.toString(score);
        team2.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher5.getFirstName() + " " + teacher5.getLastName() + " scored " + points +  " to Team " + team2.getTeamID() + " from " + team2.getCollegeName() + ".");
        System.out.println("Team " + team2.getTeamID() + " from " + team2.getCollegeName() + " has " + team2.getTeamScore() + " points.");
        System.out.println("");
        System.out.println("*********");
        System.out.println(" ");


        // TEAM 3
        // A judge 1 scoring team 3 (with decimal points)
        //Resetting score
        score = 0.0;
        System.out.println(team3.toString());
        System.out.println("");
        pointsD = 7.5;
        // Checking for negative values
        try {
            scoreCheckD(pointsD);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            pointsD = 0;
        }
        score += teacher4.addPoints(pointsD);
        scoreBoard = Double.toString(score);
        team3.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher4.getFirstName() + " " + teacher4.getLastName() + " scored " + pointsD +  " to Team " + team3.getTeamID() + " from " + team3.getCollegeName() + ".");
        System.out.println("Team " + team3.getTeamID() + " from " + team3.getCollegeName() + " has " + team3.getTeamScore() + " points.");
        System.out.println("");

        // A judge 2 scoring team 3 (with decimal points)
        pointsD = 4.5;
        // Checking for negative values
        try {
            scoreCheckD(pointsD);
        }
        catch (Exception e){
            System.out.println("Value entered as points can't be negative. Please try again.");
            // Making sure negative points were not added
            pointsD = 0;
        }
        score += teacher5.addPoints(pointsD);
        scoreBoard = Double.toString(score);
        team3.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher5.getFirstName() + " " + teacher5.getLastName() + " scored " + pointsD + " to Team " + team3.getTeamID() + " from " + team3.getCollegeName() + ".");
        System.out.println("Team " + team3.getTeamID() + " from " + team3.getCollegeName() + " has " + team3.getTeamScore() + " points.");
        System.out.println("");
        System.out.println("*********");
        System.out.println(" ");
    }


    // Methods to check if added points are not negative
    private static void scoreCheck(int points) {
        if (points < 0){
            throw new ArithmeticException("The system will not accept negative values");
        }
    }

    private static void scoreCheckD(double pointsD) {
        if (pointsD < 0){
            throw new ArithmeticException("The system will not accept negative values");
        }
    }


    // Method to check if login and password are correct
    private static boolean checkUserCredentials(String username, String password, Admin admin) {

        return(admin.getUsername().equals(username)) && (admin.getPassword().equals(password));
    }
}
