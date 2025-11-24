public class JavaMethodParameters {
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        System.out.println(myMethod1(2));
        int myNum1 = plusMethodoverloading(8, 5);
        double myNum2 = plusMethodoverloading(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
    static void myMethod(String fname) {
        System.out.println(fname);
    }

    static int myMethod1(int x) {
        return 5 + x;
    }
    //Method overloading
    static int plusMethodoverloading(int x, int y) {
        return x + y;
    }

    static double plusMethodoverloading(double x, double y) {
        return x + y;
    }

}
