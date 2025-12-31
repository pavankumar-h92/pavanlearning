package List;

import java.util.LinkedList;

public class ListMethods
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add methods
        list.add("A");
        list.addFirst("Start");
        list.addLast("End");
        list.add(1, "Middle");

        // Get methods
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Remove methods
        list.remove("Middle");
        list.removeFirst();
        list.removeLast();

        // Other methods
        System.out.println(list.contains("A"));
        System.out.println(list.size());

        // Stack methods
        list.push("Top");
        System.out.println(list.pop());

        System.out.println("Final List: " + list);
    }
}
