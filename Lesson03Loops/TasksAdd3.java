package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please, enter a 4-digit number:");
        int number = sc.nextInt();
        boolean isZero = false;

        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit == 0) {
                isZero = true;
                break;
            }
            number /= 10;
        }
        if (isZero) {
            System.out.println("The entered number contains at least one zero digit.");
        }
        else {
            System.out.println("The entered number does not contain zero digits.");
        }
    }
}
