package com.javapractice;

import java.util.Scanner;

public class VotingEligibility
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter your name: ");
        String name;
        name=sc.nextLine().trim(); // Read name and remove extra spaces


        if (name.isEmpty()) {
            System.out.println("Name cannot be empty."); // Print error if name is blank
            sc.close(); // Close Scanner
            return; // Exit the program
        }

        while (true)
        {

            if (name.matches("[a-zA-Z ]+"))
            {
                break; // valid, exit the loop
            } else
            {
                System.out.println("Name should contain only characters.");
            }
        }



        System.out.print("Enter your age: ");
        String ageInput = sc.nextLine().trim(); // Read age as String to handle invalid inputs
        int age ; // Variable to store converted integer age


        try {
            age = Integer.parseInt(ageInput); // Convert string to integer
        } catch (NumberFormatException e) {

            System.out.println("Entered Age must be a valid number.");
            sc.close(); // Close Scanner
            return; // Exit program
        }


        if (age < 18)
        {
                   System.out.println(name + ", you are not eligible to vote.");
        } else if (age>=18 && age <= 70)
            {

            System.out.println("Hello " + name + "! You are eligible to vote.");
            }
        else
            {
            System.out.println("Sorry " + name + ", age limit exceeded (max 70 years),so you have no voting rights.");
             }

        sc.close();
    }
}
