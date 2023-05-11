package com.shubh;

public class array {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 88, 54};
        System.out.println("This is the integer value \n" + marks.length);
        System.out.println(marks[2]);

        float [] marks1 = {98.5f, 87.9f, 23.7f, 91.2f, 87.5f, 76.6f};
        System.out.println(" These are the float values \n" + marks1.length);
        System.out.println(marks1[4]);

        String [] students = {"shubh", "abhay", "ankit", "keshav", "himanshu"};
        System.out.println("These are the string values \n" + students.length);
        System.out.println(students[3] + "\n");

        System.out.println("This is normal order \n");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("This is reverse order \n");

        for (int i = marks.length - 1; i >= 0; i--)
        {
            System.out.println( marks[i]);
        }

        System.out.println("This is for each loop ");
        for (int element: marks)
        {
            System.out.println(element);
        }
    }
}
