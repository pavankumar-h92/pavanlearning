package Assignment1_Week3_Coffee_Vending_Machine;

import java.util.Scanner;

public class CoffeeMachine_Vending {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coffee coffee = null;
        Scanner sc1= new Scanner(System.in);

        System.out.println("Welcome to Coffee Shop Choose Your option ");
        System.out.println("1. Espresso - 120");
        System.out.println("2. Latte - 150");
        System.out.println("3. Cappuccino - 180");
        System.out.println("4. RegularCoffee/FilterCoffee - 80");
        System.out.print("Choose Coffee: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new Cappuccino();
                break;
            case 4:
                coffee = new Regular();
                break;
            default:
                System.out.println("Invalid selection!");
                scanner.close();
                return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Take Away? (1 = Yes, 0 = No): ");

        int takeAwayInput = sc1.nextInt();

        Order order = new Order(coffee, quantity, takeAwayInput);
        order.printBill();

        scanner.close();
    }
}
