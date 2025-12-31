package ArrayListCollections;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayListusingCopyOnWriteArrayList {
    public static void main(String[] args) {

        // CopyOnWriteArrayList is thread-safe by default
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("CopyOnWriteArrayList: " + list);

        // Iteration (NO need for synchronized block)
        for (Integer num : list) {
            System.out.println("Value: " + num);
        }
    }
}
//Fully thread-safe without needing extra synchronization