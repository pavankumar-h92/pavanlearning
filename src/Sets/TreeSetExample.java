package Sets;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        //TreeSet is a Java Collection that stores unique elements in sorted order.
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("HeadSet(30): " + set.headSet(30));
        System.out.println("TailSet(20): " + set.tailSet(20));

        set.remove(40);
        System.out.println("After remove: " + set);

    }
}
