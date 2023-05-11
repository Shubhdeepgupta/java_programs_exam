package com.shubh;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {

        float eng, maths, science, hindi, cs, maxMarks, m, passing_marks;
        Scanner test = new Scanner(System.in);

        System.out.println(" \t\tEnter the marks of all subjects");

        System.out.println("Enter the marks of eng");
        eng = test.nextInt();

        System.out.println("Enter the marks of maths");
        maths = test.nextInt();

        System.out.println("Enter the marks of science");
        science = test.nextInt();

        System.out.println("Enter the marks of hindi");
        hindi = test.nextInt();

        System.out.println("Enter the marks of cs");
        cs = test.nextInt();

        System.out.println("Enter the maximum marks of a subject");
        m = test.nextInt();

        maxMarks = m * 5;


        passing_marks = (m /100) * 33;

        if (eng > passing_marks && maths > passing_marks && science > passing_marks && hindi > passing_marks && cs > passing_marks)
        {
            System.out.println("You are passed in all subjects");
        }
        else
        {
            System.out.println("you are failed in subjects marks");
        }


        float totalMarks = eng + maths + science + hindi + cs;




        float percentage = (totalMarks / maxMarks) * 100;

        if (percentage > 40)
        {
            System.out.println("Percentage of a Student is " + (percentage));
        }
        else
        {
            System.out.println("you are failed in overall percentage");
        }


    }
}
