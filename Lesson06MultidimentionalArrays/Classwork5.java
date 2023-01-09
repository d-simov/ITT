package Lesson06MultidimentionalArrays;

public class Classwork5 {


    public static void main(String[] args) {

//  which is more - odd numbers or even numbers in the matrix;

        int[][] matrix = {
                {1,3,1,5},
                {4,2,8,6},
                {3,9,9,0},
                {4,8,5,7}
        };
        int counterOdd = 0;
        int counterEven = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    counterEven++;
                }
                else {
                    counterOdd++;
                }
            }
        }
        if (counterEven > counterOdd) {
            System.out.println("Even is more: " + counterEven + ".");
        }
        else {
            System.out.println("Odd is more: " + counterOdd + ".");
        }
    }
}
