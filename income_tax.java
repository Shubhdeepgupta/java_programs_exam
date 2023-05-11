package com.shubh;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        float tax = 0, total_income;

        Scanner income = new Scanner(System.in);

        System.out.println("Enter your total income in lakhs ");
        total_income = income.nextByte();

        if (total_income <= 2.5f )
        {
            tax = tax + 0;
        }
        else if (total_income > 2.5f && total_income <= 5f)
        {
            tax = tax + .05f * (total_income - 2.5f);
        }
        else if (total_income > 5f && total_income <= 50.0f)
        {
            tax = tax + .05f * (5.0f - 2.5f);
            tax = tax + .10f * (total_income - 5f);
        }
        else if (total_income > 50f)
        {
            tax = tax + .05f * (5.0f - 2.5f);
            tax = tax + .10f * (50.0f - 5f);
            tax = tax + .20f * (total_income - 50f);
        }
        System.out.println("Your income tax of this year is \n"+ tax);
    }
}
