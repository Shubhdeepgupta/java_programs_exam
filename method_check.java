package com.shubh;

public class method_check {

    // taking method from another class


    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c;

        methods obj = new methods();
        c = obj.logistics(a, b);

        System.out.println("The value is " + c);



    }
}
