package TreeMap;

import java.util.HashMap;
import java.util.TreeMap;


public class HashMapvsTreeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Key–Value pairs
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");

        System.out.println("HashMap Output: " + hashMap);
        System.out.println("------------------------------");
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Key–Value pairs
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");

        System.out.println("TreeMap Output: " + treeMap);
    }

}
