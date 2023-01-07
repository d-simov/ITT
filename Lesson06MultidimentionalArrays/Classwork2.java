package Lesson06MultidimentionalArrays;

public class Classwork2 {

    public static void main(String[] args) {

//  find the difference between the max and the min element in the matrix;

        int[][] matrix = {
                {1, 3, 1, 5},
                {4, 2, 8, 6},
                {3, 9, 9, 0},
                {4, 8, 5, 7}
        };
        int maxElement = matrix[0][0];
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        System.out.println("The difference between max and min element is:");
        System.out.println(maxElement + minElement);
    }
}
