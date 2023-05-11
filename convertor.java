package com.shubh;

import java.util.Scanner;

public class convertor {
    public static void main (String[] args) {

        float convertor, distance;

        Scanner convert = new Scanner(System.in);


        System.out.println("Enter the distance in kilometer");
        distance = convert.nextFloat();

        convertor = distance / 1.609f;

        System.out.println("The conversion of km into miles is " + convertor);

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());



    }
}
