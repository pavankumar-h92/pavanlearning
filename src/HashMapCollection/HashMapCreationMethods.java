package HashMapCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapCreationMethods {
    public static void main(String[] args) {
        //Most common way
        //Capacity = 16, Load factor = 0.75
        System.out.println("Default HashMap:");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        System.out.println(map1);

        //reduces rehashing
        //Good for performance
        System.out.println("\nHashMap with Initial Capacity:");
        HashMap<Integer, String> map2 = new HashMap<>(50);
        map2.put(1, "A");
        map2.put(2, "B");
        System.out.println(map2);

        //Complete control over resizing behavior
        System.out.println("\nHashMap with Initial Capacity + Load Factor:");
        HashMap<Integer, String> map3 = new HashMap<>(16, 0.5f);
        map3.put(1, "A");
        map3.put(2, "B");
        System.out.println(map3);

        //Clones all key-value pairs
        System.out.println("Copy Constructor:");
        HashMap<Integer, String> original = new HashMap<>();
        original.put(100, "X");
        original.put(200, "Y");
        HashMap<Integer, String> map4 = new HashMap<>(original);
        System.out.println(map4);

        //Quick way to load data
        System.out.println("\nUsing putAll():");
        HashMap<Integer, String> map5 = new HashMap<>();
        map5.putAll(original);
        System.out.println(map5);

        System.out.println("\nUsing Map.of() – Immutable:");
        Map<Integer, String> map6 = Map.of(1, "A", 2, "B", 3, "C");
        System.out.println(map6);

        //Best for many entries
        System.out.println("\nUsing Map.ofEntries() – Immutable:");
        Map<Integer, String> map7 = Map.ofEntries(
                Map.entry(1, "A"),
                Map.entry(2, "B"),
                Map.entry(3, "C")
        );
        System.out.println(map7);

        //Useful when converting arrays or lists into maps
        System.out.println("\nUsing Streams:");
        Map<Integer, String> map8 =
                Stream.of(new Object[][]{
                        {1, "A"},
                        {2, "B"},
                        {3, "C"}
                }).collect(Collectors.toMap(
                        e -> (Integer) e[0],
                        e -> (String) e[1]
                ));
        System.out.println(map8);


    }
}
