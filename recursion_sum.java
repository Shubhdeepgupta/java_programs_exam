package com.shubh;

import java.util.Scanner;

public class recursion_sum {

    static int sumRecursion(int n)
    {
        if (n == 1)
        {
            return 1;
        }

        else
        {
            return n + sumRecursion(n - 1);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of integers you want the sum");

        int n = sc.nextInt();

        int c = sumRecursion(n);

        System.out.println(c);

    }
}
