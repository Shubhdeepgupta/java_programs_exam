package com.shubh;

import java.util.Scanner;


public class recursion {

    // factorial (0) = 1
    // factorial (n) = n * n-1 ........1
    // factorial (5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial (n) = n * factorial (n-1)

// factorial with loop
    static int factorial_iterative ( int n )
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i = 1; i <= n; i++)
            {
                product *= i;
            }
            return product;
        }
    }



    // factorial with only conditional statement
    static int factorialA (int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorialA(n-1);   // factorial call its function itself
        }
    }

    // using rcursion

    public static void main(String[] args) {
        int n;

        System.out.println("Enter the value in which you want to print the factorial");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("The value of factorial is: " + factorialA(n));

        System.out.println("The value of factorial in iterative is: " + factorial_iterative(n));


    }

}
