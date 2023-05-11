package com.shubh;

public class method_varargs {

//    static int sum (int a, int b)
//    {
//        return a + b;
//    }
//
//    static int sum (int a, int b, int c)
//    {
//        return a + b + c;
//    }
//
//    static int sum (int a, int b, int c, int d)
//    {
//        return a + b + c + d;
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println("welcome to varargs ");
//        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
//        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
//
//    }






//

//    static int sum(int ...arr) {
//        int result = 0;
//
//        for (int a : arr) {
//            result += a;
//        }
//
//        return result;
//    }
//
//
//        public static void main(String[] args) {
//        System.out.println("welcome to varargs ");
//        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
//        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
//        System.out.println("The sum of 4, 6, 3, 9, 7, 56 is: " + sum(4, 6, 3, 9, 7, 56));
//
//
//        // it will return 0 because it is a empty array
//        System.out.println("The sum of empty array is: " + sum());
//
//    }








    // here (int x, int ...arr) so that you can not pass the empty array
    static int sum(int x, int ...arr) {
        int result = x;

        for (int a : arr) {
            result += a;
        }

        return result;
    }


            public static void main(String[] args) {
        System.out.println("welcome to varargs ");
                System.out.println("The sum of  5 is: " + sum(5));
                System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
        System.out.println("The sum of 4, 6, 3, 9, 7, 56 is: " + sum(4, 6, 3, 9, 7, 56));


        // here you can not pass the empty array
//        System.out.println("The sum of empty array is: " + sum());

    }
}

