package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class BookTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first coordinate for the first field:");
        int x1 = sc.nextInt();
        System.out.println("Enter the second coordinate for the first field:");
        int y1 = sc.nextInt();
        System.out.println("Enter the first coordinate for the second field:");
        int x2 = sc.nextInt();
        System.out.println("Enter the second coordinate for the second field:");
        int y2 = sc.nextInt();

        if (x1 > 8 || x1 < 1 || x2 <1 || x2 > 8 || y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8) {
            System.out.println("You have not entered a valid chess board field number.");
        }
        else {
            if (((x1 % 2 == 0) && (y1 % 2 == 0)) || ((x1 % 2 != 0) && (y1 % 2 != 0))) {
                if (((x2 % 2 == 0) && (y2 % 2 == 0)) || ((x2 % 2 != 0) && (y2 % 2 != 0))) {
                    System.out.println("The two fields [" + x1 + ", " + y1 + "] and [" + x2 + ", " + y2 + "] are with the same colour.");
                }
                else {
                    System.out.println("The two fields [" + x1 + ", " + y1 + "] and [" + x2 + ", " + y2 + "] are NOT with the same colour.");
                }
            }
            if (((x1 % 2 != 0) && (y1 % 2 == 0)) || ((x1 % 2 == 0) && (y1 % 2 != 0))) {
                if (((x2 % 2 == 0) && (y2 % 2 == 0)) || ((x2 % 2 != 0) && (y2 % 2 != 0))) {
                    System.out.println("The two fields [" + x1 + ", " + y1 + "] and [" + x2 + ", " + y2 + "] are NOT with the same colour.");
                }
                else {
                    System.out.println("The two fields [" + x1 + ", " + y1 + "] and [" + x2 + ", " + y2 + "] are with the same colour.");
                }
            }
        }
    }

}
