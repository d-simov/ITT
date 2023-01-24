package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task11_2_Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        do {
            System.out.println("Please, enter two positive numbers for dimensions of the matrix: 1-rows; 2 - columns: ");
            rows = sc.nextInt();
            columns = sc.nextInt();
        } while (rows <= 0 || columns <= 0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(((i + 1) + j * rows) + " ");
            }
            System.out.println();
        }
    }

}
