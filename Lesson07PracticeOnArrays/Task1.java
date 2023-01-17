package Lesson07PracticeOnArrays;

public class Task1 {

    public static void main(String[] args) {

        int[][] matrix = {
                {11,12,13,14,15,16},
                {21,22,23,24,25,26},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55,56},
                {61,62,63,64,65,66},
        };

        boolean areAllPositive = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    areAllPositive = false;
                    break;
                }
            }
            if (!areAllPositive) {
                break;
            }
        }
        if (areAllPositive) {
            System.out.println("All numbers are positive.");
        }
        else {
            System.out.println("NOT all numbers are positive!");
        }


    }

}
