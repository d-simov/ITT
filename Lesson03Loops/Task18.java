package Lesson03Loops;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Моля, въведете две числа от интервала [1..9]:");
        
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
