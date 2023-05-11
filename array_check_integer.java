package com.shubh;

public class array_check_integer {
    public static void main(String[] args) {
        int [] marks = {49, 58, 78, 98, 68};

        boolean isInArray = false;

        for (int element:marks)
        {
            if (98 == element)
            {
                isInArray = true;
                break;
            }
        }

        if (isInArray)
        {
            System.out.println("The value is present in an array");
        }
        else
        {
            System.out.println("The num is not present in array");
        }
    }
}
