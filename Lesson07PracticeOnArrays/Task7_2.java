package Lesson07PracticeOnArrays;

public class Task7_2 {

    public static void main(String[] args) {

        int[][] matrix = {
                {11,12,13,14,15,16},
                { 2,22,23,24,25,26},
                { 1, 1,33,34,35,36},
                { 1, 1, 1,44,45,46},
                { 1, 2, 1, 1,55,56},
                { 1, 1, 1, 1, 2,66},
        };
        int result = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i) {
                    result *= matrix[i][j];
                }
            }
        }
        System.out.println("The result of multiplication of all elements below the main diagonal is " + result + ".");
    }
}
