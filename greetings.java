package com.shubh;

import java.util.Scanner;

public class greetings {

    public static void main (String[] args) {

        Scanner greet = new Scanner(System.in);

        System.out.println("Enetr your name");

        String greeting = greet.next();

        System.out.println("HELLO, Good day " + greeting);

    }
}
