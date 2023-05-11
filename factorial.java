package com.shubh;

import java.util.Scanner;

public class factorial {
    public factorial(int i) {
    }
//    public static void main(String[] args) {
//        int n, i, fact = 1;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the no. ");
//        n = sc.nextInt();
//
//        for (i = n; i >= 1; i--)
//        {
//            fact = fact * i;
//        }
//        System.out.println("The value of factorial is " + fact);
//    }
//}

    public static void main(String[] args) {
        int i = 1, n, fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.");
        n = sc.nextInt();

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println("The value of factorial is " + fact);

    }
}