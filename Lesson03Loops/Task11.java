package Lesson03Loops;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        System.out.println("Please, enter he height of the triangular:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        char space = 32;
        char star = 42;

        for (int i = 1; i <= height; i++) {
            for (int j = 2 * height - 2 * i; j > 0 ; j--) {
                System.out.print(space);
            }
            for (int j = 1; j < i * 2 ; j++) {
                System.out.print(star + " ");
            }

            System.out.println();
        }

    }
}
