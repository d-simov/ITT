package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask13AsRecursion {

        public static void main(String[] args) {
        /* Да се състави програма, която извежда всички естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.

Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
         */

            Scanner sc = new Scanner(System.in);
            int sum;
            do {
                System.out.print("\nPlease enter a number for SUM between '2' and '27', incl.: ");
                sum = Integer.parseInt(sc.nextLine());
            } while (sum < 2 || sum > 27);

            printCorrectNumbers(100, 1000, sum);
        }

        private static void printCorrectNumbers(int startingNumber, int endingNumber, int sum) {
            if (startingNumber == endingNumber) {
                return;
            }
            int digit1 = startingNumber / 100;
            int digit2 = (startingNumber / 10) % 10;
            int digit3 = startingNumber % 10;

            if (digit1 + digit2 + digit3 == sum) {
                System.out.println(startingNumber);
            }
            printCorrectNumbers(++startingNumber, endingNumber, sum);
        }
}
