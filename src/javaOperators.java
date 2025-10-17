public class javaOperators {
    public static void arithmetic_Operators()
    {
    /*Java arithmetic operators are used to perform basic mathematical operations such as addition, subtraction, multiplication, and division.
    These operators work with numeric data types like int, float, double, and long.
    They are essential for calculations in programming*/

        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

    }
    public static void Assignment_Operators()
    {
        //Java assignment operators are used to assign values to variables.
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );
    }
    public static void Relational_Operators()
    {
        //Java relational operators are used to compare two values. These operators return a boolean result: true if the condition is met and false otherwise.
        // Relational operators are commonly used in decision-making statements like if conditions and loops.
        int a = 10;
        int b = 20;

        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
    }
    public static void Logical_Operators()
    {
        //Java logical operators are used to perform logical operations on boolean values.
        // These operators are commonly used in decision-making statements such as if conditions and loops to control program flow.
        boolean a = true;
        boolean b =  true;
        boolean c= false;

        System.out.println("a && b = " + (a&&c));
    }

    public static void main(String[] arg)
    {
        arithmetic_Operators();
        Assignment_Operators();
        Relational_Operators();
        Logical_Operators();
    }
}
