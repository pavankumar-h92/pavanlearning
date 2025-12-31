package Stack;

public class StackArray {
    static class Stack {
        int[] arr = new int[5];
        int top = -1;

        // push
        void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
            System.out.println(x + " pushed");
        }

        // pop
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        // peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        // check empty
        boolean isEmpty() {
            return top == -1;
        }

        // check full
        boolean isFull() {
            return top == arr.length - 1;
        }

        // display
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        System.out.println("Stack Elements:");
        s.display();
    }
}
