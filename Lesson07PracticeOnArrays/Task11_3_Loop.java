package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task11_3_Loop {

    public static void main(String[] args) {

        int rows;
        int columns;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please, enter two positive, integer numbers for the number of ROWS and number of COLUMNS: ");
            rows = sc.nextInt();
            columns = sc.nextInt();
        } while (rows <= 0 || columns <= 0);

        int startingNumber = 1;
        for (int i = 0; i < rows; i++) {
            startingNumber += i;
            int number = startingNumber;
            int columnSpace = (Math.min((2 + i), rows));
            for (int j = 0; j < columns; j++) {
                if (number < 10) {
                    System.out.print(" " + number + " ");
                }
                else {
                    System.out.print(number + " ");
                }
                number = number + columnSpace;
                if (i + j < rows - 2) {
                    columnSpace++;
                }
                else if (i + j > columns - 2) {
                    columnSpace--;
                }
                else {
                    columnSpace = rows;
                }
            }
            System.out.println();
        }
    }

}
