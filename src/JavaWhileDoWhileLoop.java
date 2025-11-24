public class JavaWhileDoWhileLoop {
    public static void main(String[] args) {
        //Loops can execute a block of code as long as a specified condition is true.
        //The while loop repeats a block of code as long as the specified condition is true:
        int i = 0;
        while (i < 5) // while loop (entry control loop)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("___________________________");
        //The do/while loop is a variant of the while loop. This loop will execute the code block once,
        // before checking if the condition is true. Then it will repeat the loop as long as the condition is true.
        int j = 5;
        do
        {
            System.out.println(j);
            j--;
        }
        while (j > 0); // do while loop (exit control loop)

    }
}
