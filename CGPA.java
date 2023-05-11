package com.shubh;

import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {

        float eng, maths, science, hindi, cs, maxMarks, m, cgpa;
        int x;
        Scanner test = new Scanner(System.in);

        System.out.println("Enter the marks of all subjects");

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


        float totalMarks = eng + maths + science + hindi + cs;

        System.out.println("Enter the maximum marks of a subject");
        m = test.nextInt();

        maxMarks = m * 5;



        float percentage = (totalMarks / maxMarks) * 100;

        cgpa = (percentage / 9.5f);

        System.out.println("Percentage of a Student is " + (percentage));

        System.out.println("Your CGPA of this class is " + cgpa);
    }
}

