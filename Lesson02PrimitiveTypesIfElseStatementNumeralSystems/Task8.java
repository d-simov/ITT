package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a 4-digit number:");
        int initialNumber = sc.nextInt();
        int first2Digit = 0;
        int second2Digit = 0;

        int nextDigit = initialNumber % 10;
        first2Digit += nextDigit;
        initialNumber /= 10;

        nextDigit = initialNumber % 10;
        second2Digit += nextDigit;
        initialNumber /= 10;

        nextDigit = initialNumber % 10;
        second2Digit += (nextDigit * 10);
        initialNumber /= 10;

        nextDigit = initialNumber % 10;
        first2Digit += (nextDigit * 10);

        if (first2Digit > second2Digit) {
            System.out.println(first2Digit + " > " + second2Digit);
        } else if (first2Digit == second2Digit) {
            System.out.println(first2Digit + " = " + second2Digit);
        }
        else {
            System.out.println(first2Digit + " < " + second2Digit);
        }


    }
}
