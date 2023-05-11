package com.shubh;

public class array_avg {
    public static void main(String[] args) {
        float sum = 0, avg;
        float [] marks = {21.6f, 56.7f, 65.4f, 46.9f, 98.5f};

        for (float element:marks)
        {
            sum = sum + element;
        }

        System.out.println("The sum of all values \n" + sum);

        avg = sum/marks.length;

        System.out.println("The avg marks is \n" + avg);
    }
}
