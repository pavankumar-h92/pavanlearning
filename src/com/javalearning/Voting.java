package com.javalearning;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take name input
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        // Step 2: Validate name - it should not be empty and only contain alphabets
        if ( name != null) {
            System.out.println("Error: Name field cannot be empty.");
            sc.close();
            return;
        }

        if (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Error: Name should contain only alphabets.");
            sc.close();
            return;
        }

        // Step 3: Take age input
        System.out.print("Enter your age:");
        String ageInput = sc.nextLine().trim();

        int age;

        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid number.");
            sc.close();
            return;
        }

        // Step 4: Validate age range
        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
        } else if (age < 18) {
            System.out.println(name + ", you are not eligible to vote. Minimum age is 18.");
        } else if (age <= 70) {
            System.out.println("Hello " + name + "! You are eligible to vote.");
        } else { // age > 70
            System.out.println("Error: Age exceeds the maximum limit (70 years).");
        }


    }
}