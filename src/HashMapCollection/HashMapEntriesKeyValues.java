package HashMapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapEntriesKeyValues {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Pavan");
        map.put("City", "Hyderabad");
        map.put("Role", "Tester");

        //Convert HashMap entries → ArrayList
        ArrayList<Map.Entry<String, String>> entryList =
                new ArrayList<>(map.entrySet());
        for (Map.Entry<String, String> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
