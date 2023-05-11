package com.shubh;

import java.util.Scanner;

public class function_pattern {

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            System.out.println("");

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

        }
    }



    static void newPattern (int n)
    {
                for (int i = 1; i <= n; i++)
        {

            System.out.println("");

            for (int j = 1; j <= 2*i -1; j++)
            {

                System.out.print("*");
            }

        }
    }

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lines you want to print");

        n = sc.nextInt();

        pattern(n);
        System.out.println("");
        newPattern(n);

//        System.out.println("The value of factorial" + pattern(int n));

    }
}



