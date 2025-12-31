package com.javalearning;

import java.util.Scanner;

public class V1 {


    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z ]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (!isValidName(name)) {
            System.out.println("Invalid name. Please enter a name with only letters and spaces.");
            return;
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry " + name + ", you are too young to vote.");
        } else if (age > 70) {
            System.out.println("Sorry " + name + ", you have exceeded the maximum voting age limit.");
        } else {
            System.out.println("Hello " + name + ", you are eligible to vote.");
        }

        scanner.close();
    }
}