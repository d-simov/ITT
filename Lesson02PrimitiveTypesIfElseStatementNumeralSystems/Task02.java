package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first integer number:");
        int intNumber1 = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter the second integer number:");
        int intNumber2 = Integer.parseInt(sc.nextLine());

        int intSum = intNumber1 + intNumber2;
        int intDiff = intNumber1 - intNumber2;
        int intMultiply = intNumber1 * intNumber2;
        int intDiv = intNumber1 / intNumber2;
        int leftover = intNumber1 % intNumber2;

        System.out.println("Please, enter the first floating point number:");
        double floatNumber1 = Double.parseDouble(sc.nextLine());
        System.out.println("Please, enter the second floating point number:");
        double floatNumber2 = Double.parseDouble(sc.nextLine());

        double doubleSum = floatNumber1 + floatNumber2;
        double doubleDiff = floatNumber1 - floatNumber2;
        double doubleMultiply = floatNumber1 * floatNumber2;
        double doubleDiv = floatNumber1 / floatNumber2;

        System.out.println("The sum of the integer numbers is " + intSum + ".");
        System.out.println("The difference of the integer numbers is " + intDiff + ".");
        System.out.println("The multiplication result of the integer numbers is " + intMultiply + ".");
        System.out.println("The division result of the integer numbers is " + intDiv + ".");
        System.out.println("The division leftover of the integer number is " + leftover + ".");
        System.out.println();
        System.out.println("The sum of the floating point numbers is " + doubleSum + ".");
        System.out.println("The difference of the floating point numbers is " + doubleDiff + ".");
        System.out.println("The multiplication result of the floating point numbers is " + doubleMultiply + ".");
        System.out.println("The division result of the floating point numbers is " + doubleDiv + ".");

    }
}
