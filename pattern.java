package com.shubh;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lines you want to print");

        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {

            System.out.println("");

            for (int j = 1; j <= i; j++)
            {

                System.out.print("*");
            }

        }
    }
}


//public class pattern_function {
//
//    public static void main(String[] args) {
//
//        int n;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the lines you want to print");
//
//        n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++)
//        {
//
//            System.out.println("");
//
//            for (int j = 1; j <= 2*i -1; j++)
//            {
//
//                System.out.print("*");
//            }
//
//        }
//    }
//}
