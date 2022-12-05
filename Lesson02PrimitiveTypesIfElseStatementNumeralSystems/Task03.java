package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter value for number A:");
        double numberA = sc.nextDouble();
        System.out.println("Please, enter value for number B:");
        double numberB = sc.nextDouble();

        System.out.println("The original values of the numbers are: \nA = " + numberA + "\nB = " + numberB);

        double tempNumber = numberA;
        numberA = numberB;
        numberB = tempNumber;

        System.out.println("\nThe new values of the numbers are: \nA = " + numberA + "\nB = " + numberB);

    }
}
