package com.company;

public class Main {

    public static void main(String[] args) {

//        keywords are reserved words like int, public, static and void
//        expressions are items like int kilometers = 100;
//        if(highScore == 50) { }  the highscore expression is an expression
//        System.out.println("You got the hi score"); The component between the brackets is an expression;
//        a statement, is the entire line, ending with the semi-colon

        int score = 2000;

        calculateScore(score);
    }

    public static void calculateScore(int score) {
        System.out.println("This is a test");

        if(score <= 5000) {
            System.out.println("Youre score was less than 5000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
