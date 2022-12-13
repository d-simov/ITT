package Lesson03Loops;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете едно число:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Моля, въведете едно число:");
        int number2 = sc.nextInt();

        if (number1 < number2) {
            for (int i = number1; i <= number2 ; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = number2; i <=number1 ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
