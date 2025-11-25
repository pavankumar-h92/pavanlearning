package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareHashMaps
{
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Cherry");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Apple");
        map3.put(2, "Cherry");
        map3.put(4, "Banana");

        // Compare By Key-Value (exact match)
        System.out.println("Compare map1 & map2 by key-value: " + map1.equals(map2));
        System.out.println("Compare map1 & map3 by key-value: " + map1.equals(map3));

        //Compare by Keys only
        System.out.println("\nCompare map1 & map2 keys: " + map1.keySet().equals(map2.keySet()));
        System.out.println("Compare map1 & map3 keys: " + map1.keySet().equals(map3.keySet()));

        //Compare by Values only (order matters)
        System.out.println("\nCompare values (order matters): " + new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));

    }
}
