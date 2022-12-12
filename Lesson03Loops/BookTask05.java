package Lesson03Loops;

import java.util.Scanner;

public class BookTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter 2 integer numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        long factorial1 = 1;
        long factorial2 = 1;

        for (int i = 2; i <= number1; i++) {
            factorial1 *= i;
        }
        for (int i = 2; i <= number2; i++) {
            factorial2 *= i;
        }

        long factorialSum = factorial1 + factorial2;
        System.out.println ("The sum of the factorials of the numbers " + number1 + " and " + number2 + " is " + factorialSum + ".");
    }

}
