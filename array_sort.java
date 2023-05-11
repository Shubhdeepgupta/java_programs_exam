package com.shubh;

public class array_sort {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {1, 254, 785, 456, 982, 753, 951, 852, 258};

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
        {
            System.out.println("This array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }


        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                isSorted = false;
                break;
            }
        }

    }
}
