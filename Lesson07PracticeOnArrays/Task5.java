package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrixWidth;
        int matrixHeight;
        do {
            System.out.println("Please, enter a positive number, smaller than 1000 for width of the matrix:");
            matrixWidth = sc.nextInt();
            System.out.println("Please, enter a positive number, smaller than 1000 for height of the matrix:");
            matrixHeight = sc.nextInt();
        } while (matrixHeight <= 0 || matrixHeight >= 1000 ||matrixWidth <= 0 || matrixWidth >= 1000);

        int[][] matrix = new int[matrixWidth][matrixHeight];
        int maxRowSum = 0;
        int maxRowNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Please, enter a value for row " + (i + 1) + " and column " + (j + 1));
                matrix[i][j] = sc.nextInt();
                rowSum += matrix[i][j];
            }
            if (maxRowSum < rowSum) {
                maxRowSum = rowSum;
                maxRowNumber = i;
            }
        }
        System.out.println("The way your matrix looks like:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length -1) {
                    if (matrix[i][j] < 10) {
                        System.out.print("  " + matrix[i][j]);
                    }
                    else if (matrix[i][j] < 100) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    else {
                        System.out.print(matrix[i][j]);
                    }
                }
                else {
                    if (matrix[i][j] < 10) {
                        System.out.print("  " + matrix[i][j] + ", ");
                    }
                    else if (matrix[i][j] < 100) {
                        System.out.print(" " + matrix[i][j] + ", ");
                    }
                    else {
                        System.out.print(matrix[i][j] + ", ");
                    }
                }
            }
            System.out.println();

        }



        System.out.println("The row with max sum of the elements is " + (maxRowNumber + 1));
    }

}
