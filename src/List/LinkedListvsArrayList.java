package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListvsArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        System.out.println("=====================================");
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("Orange");
        System.out.println("After addFirst: " + linkedList);
    }
}
