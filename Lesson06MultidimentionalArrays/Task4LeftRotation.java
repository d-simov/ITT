package Lesson06MultidimentionalArrays;

public class Task4LeftRotation {

    public static void main(String[] args) {

        int[][] matrix = {
                {48,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,54,55}

        };

        int[][] matrixTransposed = new int [matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixTransposed[matrix.length - 1 - j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrixTransposed.length; i++) {
            for (int j = 0; j < matrixTransposed[i].length; j++) {
                System.out.print(matrixTransposed[i][j] + " ");
            }
            System.out.println();
        }

    }

}
