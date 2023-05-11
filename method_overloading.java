package com.shubh;

public class method_overloading {
    static void foo(){
        System.out.println("Good morning bro !");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro");
    }

    static void foo (int a, int b) {
        System.out.println("good morning " + a + " " + b + "  bros");
    }

    // you can create method with same name but different parameters


//    static void foo (int a, int b) {
//        System.out.println("Method overloading ");
//    }

    public static void main(String[] args) {
        foo();
        foo(3);
        foo(2, 3);

    }
}
