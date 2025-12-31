package com.javalearning; // Package declaration (optional, groups related classes together)

import java.util.Scanner; // Import Scanner class to take user input

public class v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for user input


        System.out.print("Enter your name: ");
        String name;
        name=sc.nextLine().trim(); // Read name and remove extra spaces

        // Step 2: Validate name - it should not be empty
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
                System.out.println("Error: Name should contain only characters (A–Z).");
            }
        }


        // Step 4: Take age input from user
        System.out.print("Enter your age: ");
        String ageInput = sc.nextLine().trim(); // Read age as String to handle invalid inputs
        int age ; // Variable to store converted integer age

        // Step 5: Try converting age input to an integer
        try {
            age = Integer.parseInt(ageInput); // Convert string to integer
        } catch (NumberFormatException e) {
            // If user enters something other than a number (like text), this block runs
            System.out.println("Entered Age must be a valid number.");
            sc.close(); // Close Scanner
            return; // Exit program
        }

        // Step 6: Check voting eligibility based on age
        if (age < 18) {
            // Age less than 18 → not eligible
            System.out.println(name + ", you are not eligible to vote.");
        } else if (age>=18 && age <= 70) {
            // Age between 18 and 70 → eligible
            System.out.println("Hello " + name + "! You are eligible to vote.");
        } else {
            // Age above 70 → invalid (exceeds limit)
            System.out.println("Sorry " + name + ", age limit exceeded (max 70 years),so you have no voting rights.");
        }

         sc.close();
    }
}
