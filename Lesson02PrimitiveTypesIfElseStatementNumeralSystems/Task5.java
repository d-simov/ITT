package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first number:");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter the second number:");
        int secondNum = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter the third number:");
        int thirdNum = Integer.parseInt(sc.nextLine());
        System.out.println();

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            if (secondNum >= thirdNum) {
                System.out.println(firstNum + ", " + secondNum + ", " + thirdNum);
                return;
            }
            else {
                System.out.println(firstNum + ", " + thirdNum + ", " + secondNum);
                return;
            }
        }
        if (secondNum >= firstNum && secondNum >= thirdNum) {
            if (firstNum >= thirdNum) {
                System.out.println(secondNum + ", " + firstNum + ", " + thirdNum);
            }
            else {
                System.out.println(secondNum + ", " + thirdNum + ", " + firstNum);
            }
        }
        else {
            if (secondNum >= firstNum) {
                System.out.println(thirdNum + ", " + secondNum + ", " + firstNum);
            }
            else {
                System.out.println(thirdNum + ", " + firstNum + ", " + secondNum);
            }
        }
    }
}
