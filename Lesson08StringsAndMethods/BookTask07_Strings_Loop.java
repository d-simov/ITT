package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask07_Strings_Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sideSize;
        do {
            System.out.print("Please, enter a positive number for the length of the figure side: ");
            sideSize = sc.nextInt();
        } while (sideSize <= 0);

        for (int i = 0; i < sideSize; i++) {
            for (int j = sideSize -i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.print(i + 1);
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            if (i != 0) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        for (int i = sideSize - 2; i >= 0; i--) {
            for (int j = 0; j < sideSize - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            if (i != 0) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
