package com.shubh;

import java.util.Scanner;

public class recursion_pattern {

    static void pattern1_rec (int n)
    {
        if (n > 0)
        {
            pattern1_rec(n - 1);

            for (int i = 0; i < n; i++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }


//    static void Pattern2_rec (int n)
//    {
//        if (n < 1)
//        {
//            Pattern2_rec(n - 1 );
//
//            for (int  i = n; i > 0; i-- )
//            {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

    static void pattern2_rec (int n)
    {
        if (n < 1)
        {
            return;
        }

        System.out.print("*");
        pattern2_rec(n - 1);
    }


    static void pattern3_rec (int n)
    {
        if (n < 1)
        {
            return;
        }

        pattern2_rec(n);

        System.out.println();

        pattern3_rec(n - 1);
    }





    static void pattern3_rec (int n, int num)
    {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of lines you want to print");

        int n = sc.nextInt();


        pattern1_rec(n);

        System.out.println();

        pattern3_rec(n);
    }
}
