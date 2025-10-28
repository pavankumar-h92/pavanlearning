import java.util.Scanner;
//Use if to specify a block of code to be executed, if a specified condition is true
//Use else to specify a block of code to be executed, if the same condition is false
//Use else if to specify a new condition to test, if the first condition is false
//Use switch to specify many alternative blocks of code to be executed
public class JavaIFElse {
    public static void main(String[] args) {
        Scanner Eligible=new Scanner(System.in);
        int age ;
        boolean isCitizen = true;
        System.out.println("Please enter your age");
        age=Eligible.nextInt();
        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

    }
}
