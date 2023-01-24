package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task11_2_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        do {
            System.out.println("Please, enter two positive numbers for dimensions of the matrix: 1-rows; 2 - columns: ");
            rows = sc.nextInt();
            columns = sc.nextInt();
        } while (rows <= 0 || columns <= 0);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            int number = (i + 1);
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0){
                    matrix[i][j] = number;
                }
                else {
                    matrix[i][j] = number + j * matrix.length;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
                else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
