package TreeMap;

import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(101, "Pavan");
        table.put(102, "Kiran");
        table.put(103, "Mahesh");
        //table.put(null,"z");

        // Printing Hashtable
        System.out.println(table);

        // Getting a value
        System.out.println("Value for key 102: " + table.get(102));

        // Removing a key
        table.remove(103);
        System.out.println("After removal: " + table);

    }
}
