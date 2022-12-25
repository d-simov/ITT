package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is NOT prime.");
        }
    }
}
