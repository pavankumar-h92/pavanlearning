package HashMapCollection;

import java.util.HashMap;

public class HashMapWorking {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Puppya", 40);

        System.out.println("HashMap = " + map);

        System.out.println("Get A: " + map.get("Apple"));
        System.out.println("Get B: " + map.get("Banana"));
        System.out.println("Get C: " + map.get("Cherry"));
        System.out.println("Get D: " + map.get("Puppya"));

        int capacity = 16;
        for (String key : map.keySet()) {
            int hash = key.hashCode();
            int index = hash & (capacity - 1);
            System.out.println("Key: " + key +
                    ", hashCode: " + hash +
                    ", bucket index (hash & (16-1)): " + index);
        }
    }
}
