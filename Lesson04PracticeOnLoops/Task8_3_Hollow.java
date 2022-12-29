package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task8_3_Hollow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a positive, integer number for the height of the pyramid:");
        int pyramidHeight = Integer.parseInt(sc.nextLine());

        for (int rows = 0; rows < pyramidHeight ; rows++) {
            for (int space = 0; space < pyramidHeight - rows; space++) {
                System.out.print("  ");
            }
            if (rows == 0 || rows == pyramidHeight - 1){
                for (int stars = 1; stars <= (rows + 1) * 2 - 1; stars++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int space = 1; space <= rows * 2 - 1; space++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
