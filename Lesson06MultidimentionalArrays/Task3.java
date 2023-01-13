package Lesson06MultidimentionalArrays;

public class Task3 {

    public static void main(String[] args) {

        int[][] matrix = {
                {48,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,54,55},
                {61,69,63,64,65}
        };

        int elementsCounter = 0;
        int sumOfElements = 0;
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumOfElements += matrix[i][j];
                elementsCounter++;
            }
        }
        System.out.println("Sum of elements: " + sumOfElements);
        System.out.println("Average of all elements: " + sumOfElements / elementsCounter);
    }

}
