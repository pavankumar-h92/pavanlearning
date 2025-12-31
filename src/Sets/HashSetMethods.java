package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
    public static void main(String[] args) {
        //HashSet is a collection used to store unique elements only (no duplicates).
        //It is unordered and uses a HashMap internally.
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored

        // Check methods
        System.out.println("Contains Apple: " + set.contains("Apple"));
        System.out.println("Size: " + set.size());

        // Iterate
        Iterator<String> itr = set.iterator();
        System.out.println("Iterating HashSet:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Remove
        set.remove("Banana");

        // Clear set
        set.clear();

        System.out.println("Is empty? " + set.isEmpty());
    }
}
