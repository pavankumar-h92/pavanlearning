package HashMapCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapP
{   //SynchronizedMap locks the entire map, so only one thread can work at a time (slower).
    public static void main(String[] args) {
        Map<String, String>M1=new HashMap<String, String>();
        M1.put("1", "PP");
        M1.put("2", "ZP");
        M1.put("2", "ZP");
        Map<String, String> syncmap= Collections.synchronizedMap(M1);
        System.out.println(syncmap);
    }
}
