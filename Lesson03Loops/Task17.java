package Lesson03Loops;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете дължина на страната на квадрата и оцветяващ символ, разделени с интервал:");
        int sideSize = sc.nextInt();
        char fillingChar = sc.next().charAt(0);

        for (int i = 1; i <= sideSize; i++) {
            for (int j = 1; j <= sideSize; j++) {
                if (i == 1 || i == sideSize) {
                    System.out.print('*' + "  ");
                }
                else {
                    if (j == 1 || j == sideSize) {
                        System.out.print('*' + "  ");
                    }
                    else {
                        System.out.print(fillingChar + "  ");
                    }
                }
            }
            System.out.println();

        }

    }
}
