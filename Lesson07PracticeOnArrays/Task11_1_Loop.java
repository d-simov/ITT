package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task11_1_Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        do {
            System.out.println("Please, enter two positive numbers for dimensions of the matrix: 1-rows; 2 - columns: ");
            rows = sc.nextInt();
            columns = sc.nextInt();
        } while (rows <= 0 || columns <= 0);
        int currentNumber = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (currentNumber < 10) {
                    System.out.print(" " + currentNumber + " ");
                }
                else {
                    System.out.print(currentNumber + " ");
                }
                currentNumber++;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int numberToPrint = columns * i + j + 1;
                if (numberToPrint < 10) {
                    System.out.print(" " + numberToPrint + " ");
                }
                else {
                    System.out.print(numberToPrint + " ");
                }
            }
            System.out.println();
        }
    }

}
