package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapKeysToArrayList {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Pavan");
        map.put("City", "Hyderabad");
        map.put("Role", "Tester");

        // Convert Keys to ArrayList
        ArrayList<String> keyList = new ArrayList<>(map.keySet());

        System.out.println("ArrayList of Keys: " + keyList);
    }
}
