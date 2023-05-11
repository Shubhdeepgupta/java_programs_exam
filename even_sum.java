package com.shubh;

import java.util.Scanner;

public class even_sum {
    public static void main(String[] args) {
        int i, n, sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        n = sc.nextInt();

//        for (i = 0; i < n; i++) {
//            sum = sum + 2*(i+1);
//        }
//        System.out.println(sum);

        i = 0;

        while (i < n)
        {
            sum = sum + 2*(i+1);
            i++;
        }
        System.out.println(sum);

    }

}