public class JavaForLoop {
        //When you know exactly how many times you want to loop through a block of code, use the for loop
        //Statement 1 sets a variable before the loop starts: int i = 0
        //Statement 2 defines the condition for the loop to run: i < 5. If the condition is true, the loop will run again; if it is false, the loop ends.
        //Statement 3 increases a value each time the code block has run: i++
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
