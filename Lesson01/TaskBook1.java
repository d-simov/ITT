package Lesson01;

import java.util.Scanner;

public class TaskBook1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a value for X:");
        int x = Integer.parseInt(sc.nextLine());
        int y;
        do {
            System.out.println("Please, enter a value for Y, different from \"0\":");
            y = Integer.parseInt(sc.nextLine());
        } while (y == 0);

        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X * Y = " + (x * y));
        System.out.println("X / Y = " + (x / y));
        System.out.println("X % Y = " + (x % y));

    }

}
