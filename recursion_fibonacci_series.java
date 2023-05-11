package com.shubh;

import java.util.Scanner;

public class recursion_fibonacci_series {

    static void fibonacci (int n)
    {
        int n1 = 0, n2 = 1, n3;

        for (int i = 2; i < n; i++)
        {
            n3 = n1 + n2;

            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }


    public static void main(String[] args) {

        int n, n1 = 0, n2 = 1, n3;

        System.out.println("Enter the no. of Numbers ");

        Scanner fib = new Scanner(System.in);

        n  = fib.nextInt();

        System.out.print( n1 + " " + n2);

        fibonacci(n);


    }


}
