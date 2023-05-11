package com.shubh;

import java.util.Scanner;

public class recursion_multiplication_table {

    // print multiplication table using method

    static void multiplication (int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.format("%d X %d = %d \n", n, i, n*i);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the multiplication table no.");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        multiplication(n);
    }
}


