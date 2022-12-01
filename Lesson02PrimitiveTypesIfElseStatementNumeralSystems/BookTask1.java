package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class BookTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a 3-digit number:");
        int initialNumber = sc.nextInt();
        if (initialNumber < 100 || initialNumber > 999) {
            System.out.println("The entered number is out of range.");
        }
        else {
            int number = initialNumber;
            int digit3 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            number /= 10;
            int digit1 = number % 10;
            if (initialNumber % digit1 == 0 &&  initialNumber % digit2 == 0 && initialNumber % digit3 == 0) {
                System.out.println("The number can be divided to all its digits without leftover.");
            }
            else {
                System.out.println("The number can NOT be divided to all its digits without leftover.");
            }
        }

    }

}
