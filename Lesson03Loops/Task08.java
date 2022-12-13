package Lesson03Loops;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter initial number:");
        int initialNumber = sc.nextInt();
        int numberForPrint = initialNumber - 1;

        for (int i = 0; i < initialNumber; i++) {
            for (int j = 0; j < initialNumber; j++) {
                System.out.print(numberForPrint);
            }
            numberForPrint += 2;
            System.out.println();
        }
    }
}
