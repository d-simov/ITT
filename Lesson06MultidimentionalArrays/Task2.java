package Lesson06MultidimentionalArrays;

public class Task2 {

    public static void main(String[] args) {

        int[][] matrix = {
                {48,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,54,55},
        };

        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == (matrix.length - 1)) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

}
