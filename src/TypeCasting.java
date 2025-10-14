public class TypeCasting
{
    public static void main(String[] args)
    {
        //There are two types of type casting allowed in Java programming:

        /*Widening type casting-is also known as implicit type casting in which a smaller type is converted into a larger type,
        it is done by the compiler automatically, without data loss-byte>short>char>int>long>float>double*/

        //Narrowing type casting-explicit type conversion which is done by the programmer manually.
        // In the narrowing type casting a larger type can be converted into a smaller type


        // Type casting int to double
        int num1 = 5004;
        double num2 = 2.5;
        double sum = num1 + num2;
        // show output
        System.out.println("The value of " + num1 + " after converting to the double is " + sum);
        // Type casting double to int
        int convertedInt = (int) num2;
        // show output
        System.out.println("The value of " + num2 + " after converting to the int again is " + convertedInt);


    }
}
