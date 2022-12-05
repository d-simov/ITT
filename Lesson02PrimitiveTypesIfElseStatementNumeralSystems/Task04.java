package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        if (firstNum < secondNum) {
            System.out.println(firstNum + ", " + secondNum);
        }
        else {
            System.out.println(secondNum + ", " + firstNum);
        }
    }
}
