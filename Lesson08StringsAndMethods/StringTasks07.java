package Lesson08StringsAndMethods;

public class StringTasks07 {


    public static void main(String[] args) {

        double[][] 	doubleMatrix = {
                {0.5,8,10.56},
                {3,9.6,1.324},
                {-1.2,0,100}
        };
        String[][] stringMatrix = new String[doubleMatrix.length][doubleMatrix[0].length];

        for (int i = 0; i < doubleMatrix.length; i++) {
            for (int j = 0; j < doubleMatrix[i].length; j++) {
                stringMatrix[i][j] = String.format("%.2f", doubleMatrix[i][j]);
                if (doubleMatrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                if (Math.abs(doubleMatrix[i][j]) < 10) {
                    System.out.print("  " + stringMatrix[i][j] + " ");
                }
                else if (Math.abs(doubleMatrix[i][j]) < 100) {
                    System.out.print(" " + stringMatrix[i][j] + " ");
                }
                else {
                    System.out.print(stringMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
