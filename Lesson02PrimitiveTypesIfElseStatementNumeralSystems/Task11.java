package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a 3-digit number:");
        int initialNumber = sc.nextInt();
        int number = initialNumber;

        int digit3 = initialNumber % 10;
        initialNumber /=10;
        int digit2 = initialNumber % 10;
        initialNumber /=10;
        int digit1 = initialNumber % 10;

        if ((number % digit1 == 0) && (number % digit2 == 0) && (number % digit3) == 0) {
            System.out.println("Числото " + number + " се дели на всяка една от цифрите си без остатък.");
        }
        else {
            System.out.println(("Числото " + number + " не се дели на всяка от цифрите си без остатък."));
        }

    }
}
