package com.shubh;

public class string {
    public static void main(String[] args) {
        String greet = "Hii I am   Shubhdeep     Gupta";
        greet = greet.toLowerCase();
        System.out.println(greet);
        System.out.println(greet.toUpperCase());


//        greet = greet.replace(" ", "_");
        System.out.println(greet);

        System.out.println(greet.indexOf("  "));
        System.out.println(greet.indexOf("   "));

        greet = greet.replace("  ", " ");
        greet = greet.replace("   ", " ");
        System.out.println(greet);


    }

}