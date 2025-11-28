package Sets;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

            // Add elements
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.add("Apple");  // Duplicate → ignored

            // Display set
            System.out.println(set);

        }
}
