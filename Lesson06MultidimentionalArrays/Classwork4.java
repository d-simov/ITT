package Lesson06MultidimentionalArrays;

public class Classwork4 {

    public static void main(String[] args) {

//  display the row with min sum in the matrix;

        int[][] matrix = {
                {1,3,1,5},
                {4,2,8,6},
                {3,9,9,0},
                {4,8,5,7}
        };
        int minRowSumIndex = 0;
        int minRowSum = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum < minRowSum) {
                minRowSum = rowSum;
                minRowSumIndex = i;
            }
        }


        for (int j = 0; j < matrix[minRowSumIndex].length; j++) {
            System.out.print(matrix[minRowSumIndex][j] + " ");
        }


    }

}
