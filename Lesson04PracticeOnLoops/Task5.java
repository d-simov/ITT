package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a positive, integer number:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number you entered is not positive.");
            return;
        }
        int numberBinaryInverted = 0;

        while (number > 0) {
            int leftover = number % 2;
            numberBinaryInverted = 10 * numberBinaryInverted + leftover;
            number /= 2;
        }
        int numberBinary = 0;
        while (numberBinaryInverted > 0) {
            int leftover = numberBinaryInverted % 10;
            numberBinary = 10 * numberBinary + leftover;
            numberBinaryInverted /= 10;
        }

        System.out.println(numberBinary);
    }
}
