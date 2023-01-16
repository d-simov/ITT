package Lesson06MultidimentionalArrays;

public class Task5 {

    public static void main(String[] args) {

        int[][] matrix = {
                {48,72,13,14},
                {21,22,53,24},
                {31,57,33,34},
                {41,95,43,44}
        };


        int maxRowSum = 0;
        int firstColumnSum = 0;
        int secondColumnSum = 0;
        int thirdColumnSum = 0;
        int forthColumnSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                if (j == 0) {
                    firstColumnSum += matrix[i][j];
                }
                else if (j == 1) {
                    secondColumnSum += matrix[i][j];
                }
                else if (j == 2) {
                    thirdColumnSum += matrix[i][j];
                }
                else {
                    forthColumnSum += matrix[i][j];
                }
            }

            if (i == 0) {
                maxRowSum = rowSum;
            }
            else {
                if (maxRowSum < rowSum) {
                    maxRowSum = rowSum;
                }
            }
        }

        int maxColumnSum;
        if (firstColumnSum > secondColumnSum && firstColumnSum > thirdColumnSum && firstColumnSum > forthColumnSum) {
            maxColumnSum = firstColumnSum;
        }
        else if (secondColumnSum > firstColumnSum && secondColumnSum > thirdColumnSum && secondColumnSum > forthColumnSum) {
            maxColumnSum = secondColumnSum;
        }
        else if (thirdColumnSum > firstColumnSum && thirdColumnSum > secondColumnSum && thirdColumnSum > forthColumnSum) {
            maxColumnSum = thirdColumnSum;
        }
        else {
            maxColumnSum = forthColumnSum;
        }

        System.out.println("Max row sum is: " + maxRowSum);
        System.out.println("Max	column sum is: " + maxColumnSum);

        System.out.print("Max row sum ");
        if (maxRowSum > maxColumnSum) {
            System.out.print(">");
        }
        else if (maxRowSum < maxColumnSum) {
            System.out.print("<");
        }
        else {
            System.out.print("=");
        }
        System.out.println(" max column sum.");

    }

}
