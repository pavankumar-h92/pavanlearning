package ArrayListCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeduplicates {
    public static void main(String[] args) {
        //Hashset();
       //LinkedHashSet();
        Streams();

    }

        public static void Hashset ()
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(10);
            list.add(30);
            list.add(20);
            System.out.println("Original List: " + list);
            HashSet<Integer> hashSet = new HashSet<>(list);
            ArrayList<Integer> result1 = new ArrayList<>(hashSet);
            System.out.println("Using HashSet (no order): " + result1);
        }
        public static void LinkedHashSet()
        {
            //Using LinkedHashSet (Maintains order) → BEST
            ArrayList<Integer> list = new ArrayList<>();
            list.add(101);
            list.add(201);
            list.add(101);
            list.add(301);
            list.add(201);
            System.out.println("Original List: " + list);
            LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(list);
            ArrayList<Integer> result2 = new ArrayList<>(linkedSet);
            System.out.println("Using LinkedHashSet: " + result2);

        }
        public static void Streams()
        {
            //Using Java 8 Streams (distinct)
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1011);
            list.add(2011);
            list.add(1011);
            list.add(3011);
            list.add(2011);
            System.out.println("Original List: " + list);
            ArrayList<Integer> result3 = new ArrayList<>(list.stream().distinct().toList());
            System.out.println("Using Stream.distinct(): " + result3);
        }

}
