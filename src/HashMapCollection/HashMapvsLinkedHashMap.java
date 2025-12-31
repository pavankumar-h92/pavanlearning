package HashMapCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapvsLinkedHashMap {
    public static void main(String[] args) {

        // HashMap (No order)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap Output:");
        System.out.println(hashMap);  // Order is not guaranteed

        // LinkedHashMap (Keeps insertion order)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");



        System.out.println("\nLinkedHashMap Output:");
        System.out.println(linkedHashMap); // Order is same as insertion
    }
}
