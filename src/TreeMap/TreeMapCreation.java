package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCreation
{
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Inserting values (sorted automatically by key)
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        //map.put(, "Pav");

        System.out.println("TreeMap: " + map);

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
       // map.remove(3);

        System.out.println("After removing key 3: " + map);

        // Checking first & last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Checking key and values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
