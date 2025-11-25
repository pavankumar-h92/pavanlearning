package ArrayListCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareAllArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(30, 10, 20,10 ));

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);


        // Using equals()
        System.out.println("\n1. equals() method:");
        System.out.println("list1 equals list2 → " + list1.equals(list2)); // true
        System.out.println("list1 equals list3 → " + list1.equals(list3)); // false


        //Using containsAll() (ignores order, but not duplicates)

        System.out.println("\n2. containsAll() method:");
        boolean sameValues = list1.containsAll(list3) && list3.containsAll(list1);
        System.out.println("list1 and list3 contain same values → " + sameValues); // true


        // Sort + equals() (ignores order, checks duplicates)

        System.out.println("\n3. Sort + equals():");
        ArrayList<Integer> temp1 = new ArrayList<>(list1);
        ArrayList<Integer> temp3 = new ArrayList<>(list3);
        Collections.sort(temp1);
        Collections.sort(temp3);
        System.out.println("After sorting list1 & list3 → " + temp1.equals(temp3)); // true

    }
}
