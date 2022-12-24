package Lesson04NestedLoopsFiguresFile;

import java.util.Scanner;

public class Task4i {


    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, enter a positive, even, integer number for the size of the figure:");
            number = Integer.parseInt(sc.nextLine());
        } while (number <= 0 || number % 2 == 0);

        for (int row = 0; row < number; row++){
            if (row == 0 || row == number - 1) {
                for (int symbol = 0; symbol <= number - 1; symbol++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            else if (row == number / 2) {
                System.out.print("# ");
                for(int firstSpace = 0; firstSpace < number / 2 - 1; firstSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                for(int secondSpace = 0; secondSpace < number / 2 - 1; secondSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                System.out.println();
            }
            else if (row < number / 2) {
                System.out.print("# ");
                for (int firstSpace = 0; firstSpace < row - 1; firstSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                for (int midSpace = (number - 2) - row * 2; midSpace > 0; midSpace--) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                for (int lastSpace = 0; lastSpace < row - 1; lastSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                System.out.println();
            }
            else {
                System.out.print("# ");
                for (int firstSpace = 0; firstSpace < number - 2 - row; firstSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                for (int midSpace = 0; midSpace < row * 2 - number; midSpace++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                for (int lastSpace = 0; lastSpace < number - 2 - row; lastSpace ++) {
                    System.out.print("  ");
                }
                System.out.print("# ");
                System.out.println();
            }
        }

    }
}
