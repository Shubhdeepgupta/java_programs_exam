package com.shubh;

public class array_maxx_no {
    public static void main(String[] args) {
        int [] arr = {1, 254, 785, 456, 982, 753, 951, 852, 258};
        int max = Integer.MIN_VALUE;

//        for (int element:arr)
//        {
//            if (element > max)
//            {
//                max = element;
//            }
//        }

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in array is- " + max);
    }
}
