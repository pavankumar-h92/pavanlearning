package HashMapCollection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashtab {
    public static void main(String[] args) {


        //HashMap (Not synchronized, allows null)
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Name", "Pavan");
        hashMap.put("City", "Hyderabad");
        hashMap.put(null, "NullKeyAllowed");       // ✔ Allowed
        hashMap.put("NullValue", null);            // ✔ Allowed

        System.out.println("HashMap Output:");
        System.out.println(hashMap);

        //Hashtable (Synchronized, does NOT allow null)
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Name", "Pavan");
        hashtable.put("City", "Hyderabad");

        // Uncommenting the below lines will cause NullPointerException
           // hashtable.put(null, "Test");      // Not allowed
            //hashtable.put("NullValue", null); // Not allowed

            System.out.println("\nHashtable Output:");
            System.out.println(hashtable);
    }

}
