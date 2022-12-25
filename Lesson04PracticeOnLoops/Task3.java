package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter two numbers - A and B:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a;
        int max = b;
        if (a > b) {
            min = b;
            max = a;
        }

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

