package Lesson03Loops;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете естествено число от интервала [10..99]:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 1) {
            if (number % 2 == 0) {
                number *= 0.5;
            }
            else {
                number = number * 3 + 1;
            }
            System.out.print(number + " ");
        }
    }
}
