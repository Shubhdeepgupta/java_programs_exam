package com.shubh;

import java.util.Scanner;

public class switch_condition {
    public static void main(String[] args) {
         int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        switch (age) {


            case 18:
                System.out.println("You will become adult soon");
                break;
            case 21:
                System.out.println("You will get the job soon");
                break;
            case 28:
                System.out.println("You will get marry soon");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
    }
}
