package com.recursion;

public class Factorial
{
    static int fact(int n) {
    if (n == 0) { // Base Case
        return 1;
    }
    return n * fact(n - 1); // Recursive Case
}
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }
}
