package Lesson03Loops;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        System.out.println("Please, enter a positive, integer number:");
        Scanner sc = new Scanner(System.in);
        int customerNumber = sc.nextInt();
        int numberSum = 0;

        for (int i = 1; i <= customerNumber; i++) {
            numberSum += i;
        }
        System.out.println(numberSum);
    }
}
