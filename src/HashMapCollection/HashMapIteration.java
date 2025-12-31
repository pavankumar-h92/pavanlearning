package HashMapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration
{
    //Keys are unique
    //Values can be duplicate
    //Allows one null key and multiple null values
    //Does NOT maintain order (unordered)
    // Fast operations – O(1) for get(), put(), remove()
    //Not thread-safe (use ConcurrentHashMap for thread safety)
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pavan");
        map.put(102, "Kumar");
        map.put(103, "Reddy");

        //Iterating keys
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        //Iterating values
        System.out.println("\nValues:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        //Iterating key-value pairs (BEST)
        System.out.println("\nKey-Value Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            var entry = itr.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
       // map.forEach(k,v)-> System.out.println("Key="+k+"and value="+v);
    }
}
