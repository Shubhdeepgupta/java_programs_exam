package com.shubh;

import java.util.Scanner;

public class pattern_print {
    public static void main(String[] args) {
        int i, n, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        n = sc.nextInt();
//
//        for (i = n; i > 0; i-- )
//        {
//            for (j = 0; j < i; j++)
//            {
//                System.out.print(('*'));
//            }
//            System.out.print("\n");
//        }
        i = 0;

        while (i < n)
        {
            j = 0;

            while (j  < (n-i))
            {
                System.out.print('*');
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
