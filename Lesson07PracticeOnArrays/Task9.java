package Lesson07PracticeOnArrays;

public class Task9 {

    public static void main(String[] args) {

        int[][] matrix = {
                {11,12,13,14,15,16},
                {21,22,23,24,25,26},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55,56}
         };
        int maxSubmatrixSum = 0;
        int maxSubmatrixIndexI = 0;
        int maxSubmatrixIndexJ = 0;


        for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                int submatrixSum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if (maxSubmatrixSum < submatrixSum) {
                    maxSubmatrixSum = submatrixSum;
                    maxSubmatrixIndexI = i;
                    maxSubmatrixIndexJ = j;
                }
            }
        }
        System.out.print("The sub-matrix with maximum sum of the elements is:\n");
        System.out.println(matrix[maxSubmatrixIndexI][maxSubmatrixIndexJ] + ", " + matrix[maxSubmatrixIndexI][maxSubmatrixIndexJ + 1]);
        System.out.print(matrix[maxSubmatrixIndexI + 1][maxSubmatrixIndexJ] + ", " + matrix[maxSubmatrixIndexI + 1][maxSubmatrixIndexJ + 1]);
    }
}
