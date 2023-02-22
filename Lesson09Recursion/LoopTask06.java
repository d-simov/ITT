package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter an integer number an you will receive the sum of numbers between it and 1:");
        int number = Integer.parseInt(sc.nextLine());
        int totalSum;

        if (number >= 1) {
            totalSum = sum(1, number, 0);
        }
        else {
            totalSum = sum (number, 1, 0);
        }
        System.out.println(totalSum);
    }

    static int sum (int number1, int number2, int numbersSum) {
        if (number1 <= number2) {
            numbersSum += number1;
            return sum(++number1, number2, numbersSum);
        }
        return numbersSum;
    }
}
