package Lesson04NestedLoopsFiguresFile;

import java.util.Scanner;

public class Task7aPowerOf2Triangle {

    public static void main(String[] args) {

        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Please, enter a number between 0 and 11 for height of the pyramid: ");
            height = Integer.parseInt(sc.nextLine());
        } while (height < 1 || height > 10);

        for (int i = 0; i < height; i++) {
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print("    ");
            }
            for (int j = 0; j < i + 1; j++) {
                if ((1 << j) < 10) {
                    System.out.print("   " + (1 << j));
                }
                else if ((1 << j) < 100) {
                    System.out.print("  " + (1 << j));
                }
                else {
                    System.out.print(" " + (1 << j));
                }
            }
            for (int j = i; j > 0; j--) {
                if ((1 << j - 1) < 10) {
                    System.out.print("   " + (1 << j - 1));
                }
                else if ((1 << j - 1) < 100) {
                    System.out.print("  " + (1 << j - 1));
                }
                else {
                    System.out.print(" " + (1 << j - 1));
                }
            }
            System.out.println();
        }
    }
}
