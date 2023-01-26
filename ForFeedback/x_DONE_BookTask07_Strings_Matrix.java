package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask07_Strings_Matrix {
    /*
    Че е вярно решена - вярно е. Че е оптимално решена - май не.
    Много зачукани стават зависимостите за изписване на звездичките, затворени в ромба.
    Виждаш ли по-прост начин?
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideSize;
        do {
            System.out.print("Please, enter a positive number for the length of the figure side: ");
            sideSize = sc.nextInt();
        } while (sideSize <= 0);

        String[][] matrix = new String[sideSize * 2 - 1][sideSize * 2 - 1];
        fillMatrix(matrix, " ");

        for (int i = 0; i < matrix.length; i++) {
            if (i <= matrix.length / 2){
                matrix[i][Math.abs(matrix.length / 2 - i)] = "" + (i + 1);
                matrix[i][matrix.length / 2 + i] = "" + (i + 1);
            }
            else {
                matrix[i][Math.abs(matrix.length / 2 - i)] = "" + (matrix.length - i);
                matrix[i][matrix.length - i - 1 + matrix.length / 2] = "" + (matrix.length - i);
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            if (i <= matrix.length / 2) {
                for (int j = matrix.length / 2 - i + 1; j <= matrix.length / 2 + i - 1; j++) {
                    matrix[i][j] = "*";
                }
            }
            else {
                for (int j = i + 1 - matrix.length / 2; j < matrix.length - i - 1 + matrix.length / 2; j++) {
                    matrix[i][j] = "*";
                }
            }
        }

        printMatrix(matrix);
    }

    static void fillMatrix(String[][] mat, String character) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = character;
            }
        }
    }

    private static void printMatrix(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
