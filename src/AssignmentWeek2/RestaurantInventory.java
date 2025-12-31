package AssignmentWeek2;

import java.io.*;
import java.util.ArrayList;

class Ingredient {
    String name;
    int quantity;

    // Constructor
    Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Display ingredient details
    void display() {
        System.out.println(name + " : " + quantity);
    }
}

public class RestaurantInventory {

    // File path
    static final String FILE_NAME = "inventory.txt";

    public static void main(String[] args) {

        // Collection: ArrayList
        ArrayList<Ingredient> inventory = new ArrayList<>();

        // Adding ingredients
        inventory.add(new Ingredient("Tomato", 50));
        inventory.add(new Ingredient("Onion", 30));
        inventory.add(new Ingredient("Chicken", 20));

        // Write inventory to file
        writeToFile(inventory);

        // Read inventory from file
        readFromFile();
    }

    // File Writing
    static void writeToFile(ArrayList<Ingredient> inventory) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            for (Ingredient item : inventory) {
                writer.write(item.name + "," + item.quantity + "\n");
            }

            writer.close();
            System.out.println("Inventory written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // File Reading
    static void readFromFile() {
        try {
            FileReader reader = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nInventory from file:");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Ingredient: " + data[0] + ", Quantity: " + data[1]);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            System.out.println("\nFile operation completed.");
        }
    }
}
