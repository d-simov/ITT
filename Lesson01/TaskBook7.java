package Lesson01;

import java.util.Scanner;

public class TaskBook7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a value for the first variable X:");
        int x = sc.nextInt();
        System.out.println("Please, enter a value for the second variable Y:");
        int y = sc.nextInt();
        System.out.println("Thank you! The initial values of the variables are:\nX = " + x + "\nY = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("The swapped values of the variables are:\nX = " + x + "\nY = " + y);
    }

}
