package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListStack {

    /*LinkedListStack()
    {
        head= null;
    }*/

        Node top = null;   // top of stack

        // push
        void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x + " pushed");
    }

        // pop
        int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

        // peek
        int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

        // check empty
        boolean isEmpty() {
        return top == null;
    }

        // display
        void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListStack s = new LinkedListStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop()); // 30

        System.out.println("Stack Elements:");
        s.display();
    }

}

