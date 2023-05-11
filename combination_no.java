package com.shubh.combination_no;

import java.util.Scanner;

public class combination_no {
    public static void main(String[] args) {

        int choice = 0;
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your choice: ");
            System.out.println("Enter 1 for three separate digits :");
            System.out.println("Enter 2 for three digit integer :");
            System.out.println("Enter 3 to Exit :");

            choice = sc.nextInt();

            switch (choice) {
                case 1: for (int i = 0; i < 3; i++) {
                    System.out.println("Enter the " + (i + 1) + " digits");
                    arr[i] = sc.nextInt();
                }
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                if (j != k && j != l && k != l)
                                {
                                    System.out.println("The combinations are :-" + arr[j] + arr[k] + arr[l]);
                                }
                            }
                        }
                    }

            }

        }
    }


