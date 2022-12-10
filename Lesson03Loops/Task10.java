package Lesson03Loops;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int number = sc.nextInt();
        boolean isSimple = true;

        if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isSimple = false;
                    break;
                }
            }
        }
        if (number < -2) {
            for (int i = -2; i > number; i--) {
                if (number % i == 0) {
                    isSimple = false;
                    break;
                }
            }
        }
        if (isSimple) {
            System.out.println("The number you entered is simple.");
        }
        else {
            System.out.println("The number you entered is NOT simple.");
        }
    }
}
