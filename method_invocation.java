package com.shubh;

public class method_invocation {


//    static void change (int a)
//    {
//        a = 98;
//    }
//    public static void main(String[] args) {
//        int [] marks = {45, 65, 85, 74, 62, 96, 59};
//
//        int x = 45;
//        change(x);
//        System.out.println("The value after change is " + x);
//    }

    // in case of Array

    static void change(int [] arr) {
        arr[0] = 98;
    }

    public static void main(String[] args) {
        int[] marks = {45, 65, 85, 74, 62, 96, 59};

        change(marks);
        System.out.println("The value after change is " + marks[0]);
    }
}
