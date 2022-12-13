package Lesson03Loops;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете произволно число:");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = number; i > 0; i--) {
            sum += i;
        }
        System.out.println("Сумата от числата между \"1\" и вашето число е: " + sum);
    }
}
