package HashMapCollection;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapD {
    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "T1-" + i);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                map.put(i, "T2-" + i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("ConcurrentHashMap Output:");
        System.out.println(map);
    }
}
