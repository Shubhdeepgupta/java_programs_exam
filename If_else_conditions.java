package com.shubh;

import java.util.Scanner;

public class If_else_conditions {
    public static void main(String[] args) {


        int age;
        Scanner checking = new Scanner(System.in);

        System.out.println("Enter your age");
        age = checking.nextInt();


        if (age > 18 && age < 60) {
            System.out.println("Yes, you can drive !");
        }
        else if (age > 120){
            System.out.println("You are entering the wrong age");
        } else if (age < 0) {
            System.out.println("You have entered wrong age");

        } else {
            System.out.println("No child, You cannot drive");
        }
    }
}
