package com.shubh;

public class array_reverse {
    public static void main(String[] args) {
        int [] marks = {2, 6, 7, 3, 8, 1, 9, 4, 5};
        int l = marks.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++)
        {
            temp = marks[i];
            marks[i] = marks[l - i - 1];
            marks[l - i - 1] = temp;
        }

        for (int element : marks)
        {
            System.out.print(element + " ");
        }
    }
}
