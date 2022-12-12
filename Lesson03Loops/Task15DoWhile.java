package Lesson03Loops;

import java.util.Scanner;

public class Task15DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Please, enter a positive, integer number:");
        int customerNumber = sc.nextInt();
        int numberSum = 0;
        int i = 1;
        do {
            numberSum += i;
            i++;
        } while (i <= customerNumber);

        System.out.println(numberSum);
    }
}
