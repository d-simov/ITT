package Lesson06MultidimentionalArrays;

public class Classwork3 {

    public static void main(String[] args) {

//  find the index of the row with the max sum in the matrix;

        int[][] matrix = {
                {1,3,1,5},
                {4,2,8,6},
                {3,9,9,0},
                {4,8,5,7}
        };
        int maxRowSumIndex = 0;
        int maxRowSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSumIndex = i;
            }
        }
        System.out.println("Index of the row with max sum of the elements is:");
        System.out.println(maxRowSumIndex);
    }

}
