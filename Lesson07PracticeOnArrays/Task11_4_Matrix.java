package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task11_4_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        do{
            System.out.println("Please, enter two positive numbers for ROWS and COLUMNS of the matrix: ");
            rows = sc.nextInt();
            columns = sc.nextInt();
        } while (rows <= 0 || columns <= 0);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 != 1) {
                    matrix[i][j] = i + 1 + j * matrix.length;
                }
                else {
                    matrix[i][j] = (j+1) * matrix.length - i;
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
