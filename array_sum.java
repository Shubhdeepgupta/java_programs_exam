package com.shubh;

public class array_sum {
    public static void main(String[] args) {
        float sum = 0;
        float [] marks = {21.6f, 56.7f, 65.4f, 46.9f, 98.5f};

        // for loop

//        for (int i = 0; i < marks.length; i++)
//        {
//            sum = sum + marks[i];
//        }



        // for each loop

        for (float element:marks)
        {
            sum = sum + element;
        }

        System.out.println("The sum of all values \n" + sum);
    }
}
