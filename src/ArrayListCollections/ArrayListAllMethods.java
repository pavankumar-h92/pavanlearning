package ArrayListCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListAllMethods {
    public static void main(String[] args) {

        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("A");  // add() – add single element
        list.add("B");
        list.add("C");
        System.out.println("Initial List: " + list);

        // 2. addAll() – adding another collection
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("D", "E"));
        list.addAll(list2);  // merges both lists
        System.out.println("After addAll: " + list);

        // 3. get() – retrieve element at index
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set() – update value at index
        list.set(1, "Z");
        System.out.println("After set(1, Z): " + list);

        // 5. remove() – remove by index & value
        list.remove(0);               // removes element "A"
        list.remove("D");             // removes element "D"
        System.out.println("After remove: " + list);

        // 6. contains() – check for existence
        System.out.println("Contains C? " + list.contains("C"));

        // 7. size() – number of elements
        System.out.println("Size of list: " + list.size());

        // 8. isEmpty() – check if list is empty
        System.out.println("Is Empty? " + list.isEmpty());

        // 9. indexOf() – first occurrence
        list.add("C");
        System.out.println("indexOf C: " + list.indexOf("C"));

        // 10. lastIndexOf() – last occurrence
        System.out.println("lastIndexOf C: " + list.lastIndexOf("C"));

        // 11. sort() – sorting list
        Collections.sort(list);
        System.out.println("After sort: " + list);

        // 12. iterator() – iterating using Iterator
        Iterator<String> it = list.iterator();
        System.out.println("Iterating using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 13. forEach() – modern lambda iteration
        System.out.println("Using forEach (lambda):");
        list.forEach(item -> System.out.println(item));

        // 14. clear() – remove all elements
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
    }

}
