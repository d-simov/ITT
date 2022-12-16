package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the length of three line segments:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("These three segments can form a triangular.");
        }
        else {
            System.out.println("These three segments can not form a triangular.");
        }
    }
}
