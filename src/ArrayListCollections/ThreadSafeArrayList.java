package ArrayListCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ThreadSafeArrayList {
    public static void main(String[] args) {
        // Creating a normal ArrayList
        List<Integer> list = new ArrayList<>();

        // Making ArrayList thread-safe
        List<Integer> syncList = Collections.synchronizedList(list);

        // Adding elements
        syncList.add(10);
        syncList.add(20);
        syncList.add(30);

        // Printing the thread-safe list
        System.out.println("Thread-Safe List: " + syncList);

        // Example: accessing inside synchronized block
        synchronized (syncList) {
            for (Integer num : syncList) {
                System.out.println("Number: " + num);
            }
        }
    }
}
//Collections.synchronizedList() wraps the list with synchronized methods.
