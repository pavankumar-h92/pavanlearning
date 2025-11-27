package TreeMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTablevsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(null, "NullKeyAllowed");
        System.out.println("HashMap: " + hashMap);

        System.out.println("----------------------------");

        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "Apple");
        hashTable.put(0, "Apple");
       // hashTable.put(null, "NotAllowed"); // throws exception


        System.out.println("Hashtable: " + hashTable);


    }
}
