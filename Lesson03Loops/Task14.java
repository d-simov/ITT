package Lesson03Loops;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете естествено число N от интервала [10..200]:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >=7 ; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }

        }
    }
}
