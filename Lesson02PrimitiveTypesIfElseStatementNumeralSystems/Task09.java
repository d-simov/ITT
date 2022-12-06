package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter two 2-digit numbers, divided by \"space\":");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int multiplication = firstNum * secondNum;

        int leftover = multiplication % 10;
        System.out.print(multiplication + ", " + leftover + " ");

        if (leftover % 2 == 0) {
            System.out.print("четна");
        }
        else {
            System.out.print("нечетна");
        }

    }
}
