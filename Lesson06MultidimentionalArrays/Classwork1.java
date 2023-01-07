package Lesson06MultidimentionalArrays;

public class Classwork1 {

    public static void main(String[] args) {

//  find the max element in the matrix;

        int[][] matrix = {
                {1,3,1,5},
                {4,2,8,6},
                {3,9,9,0},
                {4,8,5,7}
        };
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Max element is:");
        System.out.println(maxElement);
    }

}
