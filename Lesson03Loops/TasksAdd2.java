package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd2 {

    public static void main(String[] args) {

        System.out.println("Please enter a 4-digit number");
        Scanner sc = new Scanner(System.in);

        int initialNumber = sc.nextInt();
        int number = initialNumber;

        int digit4 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;

        System.out.println("The number " + initialNumber + " contains:");
        System.out.println(digit1 + " thousands");
        System.out.println(digit2 + " hundreds");
        System.out.println(digit3 + " dozens");
        System.out.println(digit4 + " units");
    }
}
