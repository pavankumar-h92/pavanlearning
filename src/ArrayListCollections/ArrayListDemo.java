package ArrayListCollections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);     // index 0
        numbers.add(20);     // index 1
        numbers.add(30);     // index 2

        System.out.println("List: " + numbers);

        // Add element at a specific index
        numbers.add(1, 15);  // Insert 15 at index 1
        System.out.println("After add at index: " + numbers);

        // Get element at index 2
        System.out.println("Get index 2: " + numbers.get(2));

        // Update element at index 3
        numbers.set(3, 35);  // Change 30 → 35
        System.out.println("After set: " + numbers);

        // Remove element at index 1
        numbers.remove(1);   // Removes 15
        System.out.println("After remove: " + numbers);

        // Size of ArrayList
        System.out.println("Size: " + numbers.size());

        // Search for an element
        System.out.println("Contains 20? " + numbers.contains(20));

        // Clear the ArrayList
        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
}