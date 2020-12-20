package com.codewithchang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        One line solution (Using ternary operator)
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));


        // Iterative solution
//        int num = 6;
//        System.out.println("Factorial of " + num + " is " + factorial(6));
        }
// Ternary solution
    static int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }



//        Iterative solution
//        static int factorial(int n) {
//            int res = 1, i;
//            for (i = 2; i <= n; i++) {
//                res *= i;
//            }
//            return res;


//        -------------------------

    // Recursive solution
// Driver method
//        int num = 5;
//        System.out.println("Factorial of "+ num + " is " + factorial(5));


    // Recursive solution

// method to find factorial of given number
//    static int factorial(int n) {
//        if (n == 0)
//            return 1;
//
//        return n * factorial(n-1);
//    }
}
