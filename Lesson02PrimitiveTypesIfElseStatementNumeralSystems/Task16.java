package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a 3-digit number:");
        int number = sc.nextInt();


        int thirdDigit = number % 10;
        number /=10;
        int secondDigit = number % 10;
        number /=10;
        int firstDigit = number % 10;

        if (firstDigit == secondDigit && secondDigit == thirdDigit) {
            System.out.println("Цифрите са равни.");
        }
        else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
            System.out.println("Цифрите са в низходящ ред.");
        }
        else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
            System.out.println("Цифрите са във възходящ ред.");
        }
        else {
            System.out.println("Цифрите са ненаредени.");
        }
    }
}
