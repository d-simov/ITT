package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter value for a1:");
        int a1 = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter value for a2:");
        int a2 = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter value for a3:");
        int a3 = Integer.parseInt(sc.nextLine());

        System.out.println("The original values are: " + a1 + ", " + a2 + ", " + a3);

        int temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;

        System.out.println("The new values are: " + a1 + ", " + a2 + ", " + a3);
    }
}
