package com.shubh;

import java.util.Scanner;

public class multiplication_table {

    public static void main(String[] args) {
        int i, n, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table no. which u want to print");
        n = sc.nextInt();

        for (i = 1; i < 11; i++) {
            sum = sum + (n * i);
            System.out.println(n * (i) + "\n");
            System.out.format("%d X %d = %d \n", n, i, n * (i));

        }
        System.out.println(sum);
    }
}




