package com.javalearning; // Package declaration (optional) — helps organize Java file
import java.util.Scanner; // Import Scanner class for taking input from user

public class V3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object to read user input

        // Step 1: Get name from user by calling getName() method
        String name = getName(sc); // The method returns a valid name (String)

        // Step 2: Get age from user by calling getAge() method
        int age = getAge(sc); // The method returns a valid age (int)

        // Step 3: Check if user is eligible to vote
        checkEligibility(name, age); // Call method to print eligibility message

        sc.close(); // Close Scanner to free up system resources
    }

    // ------------------- Method 1: Get and validate name -------------------

    // This method takes Scanner as input and returns a valid name (String)
    public static String getName(Scanner sc) {
        System.out.print("Enter your name: "); // Prompt user for name
        String name = sc.nextLine().trim(); // Read input and remove leading/trailing spaces

        // Check if name is empty
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty."); // Print error message
            System.exit(0); // Stop program execution immediately
        }

        // Check if name contains only alphabets and spaces using regex
        // [a-zA-Z ]+ → allows only letters (upper/lowercase) and spaces
        if (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Error: Name should contain only alphabets and spaces."); // Error message
            System.exit(0); // Exit the program if invalid name
        }

        return name; // Return the valid name to main() method
    }

    // ------------------- Method 2: Get and validate age -------------------

    // This method takes Scanner as input and returns a valid age (int)
    public static int getAge(Scanner sc) {
        System.out.print("Enter your age: "); // Prompt user for age
        String ageInput = sc.nextLine().trim(); // Read input as String

        // Check if input contains only digits using regex
        // \\d+ → means one or more digits (0–9)
        if (!ageInput.matches("\\d+")) {
            System.out.println("Error: Age must be a valid number."); // Error message if not a number
            System.exit(0); // Stop program immediately
        }

        // Convert the string to an integer (safe because we already validated it)
        int age = Integer.parseInt(ageInput);

        return age; // Return the valid age to main() method
    }

    // ------------------- Method 3: Check eligibility -------------------

    // This method checks if user can vote based on their age (no return value → void)
    public static void checkEligibility(String name, int age) {

        // Case 1: Age less than 18 → not eligible
        if (age < 18) {
            System.out.println(name + ", you are not eligible to vote.");
        }
        // Case 2: Age between 18 and 70 → eligible
        else if (age <= 70) {
            System.out.println("Hello " + name + "! You are eligible to vote.");
        }
        // Case 3: Age greater than 70 → exceeds limit
        else {
            System.out.println("Sorry " + name + ", age limit exceeded (max 70 years).");
        }
    }
}
