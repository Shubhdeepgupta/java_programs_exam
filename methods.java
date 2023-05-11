package com.shubh;

public class methods {


    // without any method
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//
//        if (a > b)
//        {
//            c = a + b;
//        }
//        else
//        {
//            c = (a + b) * 5;
//        }
//
//        System.out.println("The value of c is " + c);
//
//
//        int a1 = 4;
//        int a2 = 6;
//        int a3;
//
//        if (a1 > a2)
//        {
//            a3 = a1 + a2;
//        }
//        else
//        {
//            a3 = (a1 + a2) * 4;
//        }
//
//        System.out.println("The value of a3 is " + a3);
//
//    }


//     //  Static method
//    static int logic(int x, int y) {
//        int z;
//        if (x > y) {
//            z = x + y;
//        } else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }
//
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//        c = logic(a, b);
//
//        System.out.println("The value of c is:- " + c);
//
//        int a1 = 5;
//        int b1 = 3;
//        int c1;
//        c1 = logic(a1, b1);
//
//        System.out.println("The value of c1 is " + c1);
//    }
//}
//




//     without static method WITH OBJECT

    int logic(int x, int y) {

        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }


    int logistics(int x, int y) {

        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 9;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        methods obj = new methods();
        c = obj.logic(a, b);

        System.out.println("The value of c is:- " + c);

        int a1 = 5;
        int b1 = 3;
        int c1;

        int a2 = 7;
        int b2 = 6;
        int c2;

//        no need to specify method again

        c1 = obj.logic(a1, b1);
        c2 = obj.logistics(a2, b2);

        System.out.println("The value of c1 is " + c1);
        System.out.println(c2);
    }
}





