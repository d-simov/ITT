package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number (A):");
        double a = sc.nextDouble();
        System.out.println("Please enter your second number (B):");
        double b = sc.nextDouble();
        System.out.println("Please enter your third number (C):");
        double c = sc.nextDouble();
        if ((a > c && c > b) || (b > c && c > a)) {
            System.out.println("The number " + c + " is between " + a + " and " + b + ".");
        }
        else {
            System.out.println("The number " + c + " is not between " + a + " and " + b + ".");
        }
    }
}
