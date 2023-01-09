package Lesson06MultidimentionalArrays;

public class Classwork6 {

    public static void main(String[] args) {

//  find the row with most odd numbers in the matrix;

        int[][] matrix = {
                {1,3,1,4},
                {4,2,8,6},
                {3,9,9,0},
                {3,1,5,7}
        };
        int mostOddNumbersRowIndex = -1;
        int maxOddNumbersInRow = -1;
        for (int i = 0; i < matrix.length; i++) {
            int oddNumbersPerRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddNumbersPerRow++;
                }
            }
            if (oddNumbersPerRow > maxOddNumbersInRow){
                maxOddNumbersInRow = oddNumbersPerRow;
                mostOddNumbersRowIndex = i;
            }
        }
        System.out.println("The row with most odd numbers (" + maxOddNumbersInRow + ") is: " + mostOddNumbersRowIndex + ".");
    }

}
