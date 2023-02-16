package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task15_Methods_FibonacciSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please, enter a positive number, for Fibonacci sequence calculation: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);

        System.out.println("The " + n + " number of Fibonacci sequence is " + calculateFibonacci(n) + ".");
    }

    private static int calculateFibonacci(int lastFibonacciNumber) {
        int beforePreviousNum = 0;
        int previousNum = 1;
        if (lastFibonacciNumber == 1){
            return beforePreviousNum;
        }
        else if (lastFibonacciNumber == 2) {
            return previousNum;
        }
        else {
            int nextNum = 0;
            for (int i = 3; i <= lastFibonacciNumber; i++) {
                nextNum = previousNum + beforePreviousNum;
                beforePreviousNum = previousNum;
                previousNum = nextNum;
            }
            return nextNum;
        }
    }
}

