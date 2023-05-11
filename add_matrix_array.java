package com.shubh;

public class add_matrix_array {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                {4, 5, 6}};

        int[][] matrix2 = {{3, 6, 9},
                {2, 4, 8}};

        int[][] matrixResult = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.format("String for i = %d, j = %d \n", i, j);
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrixResult[i][j] + " ");
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }

            System.out.println("");
        }
    }
}

