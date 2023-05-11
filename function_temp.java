package com.shubh;

import java.util.Scanner;

public class function_temp {

    static void convertor (float temp)
    {
        float farh = (temp * 9/5) + 32;

        System.out.println(farh);
    }

    public static void main(String[] args) {

        float temp;

        System.out.println("Enter the temperature you want to convert in farhenheit");

        Scanner sc = new Scanner(System.in);

        temp = sc.nextInt();

        convertor(temp);


    }
}
