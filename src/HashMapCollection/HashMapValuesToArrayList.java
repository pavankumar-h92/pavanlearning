package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapValuesToArrayList {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Pavan");
        map.put("City", "Hyderabad");
        map.put("Role", "Tester");

        // Convert Values to ArrayList
        ArrayList<String> valueList = new ArrayList<>(map.values());

        System.out.println("ArrayList of Values: " + valueList);
    }
}
