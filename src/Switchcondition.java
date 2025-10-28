import java.util.Scanner;

public class Switchcondition {
    public static void main(String[] args) {


    Scanner Check=new Scanner(System.in);
    int day ;
        System.out.println("Please enter your Day\n");
    day=Check.nextInt();
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Looking forward to correct day to be entered");
    }


}

}
