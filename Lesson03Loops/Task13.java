package Lesson03Loops;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        System.out.println("Please, enter an integer number:");
        Scanner sc = new Scanner(System.in);
        int clientNumber = sc.nextInt();

        for (int i = 100; i < 1000; i++) {
            int currentNum = i;
            int digitSum = 0;
            while (currentNum != 0) {
                int currentDigit = currentNum % 10;
                digitSum += currentDigit;
                currentNum /= 10;
            }
            if (digitSum == clientNumber) {
                System.out.println(i);
            }

        }
    }
}
