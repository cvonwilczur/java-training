package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); //handles next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Your name is " + name + "and your year of birth is " + yearOfBirth);
    }
}
