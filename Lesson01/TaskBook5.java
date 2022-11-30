package Lesson01;

import java.util.Scanner;

public class TaskBook5 {

    public static void main(String[] args) {

        boolean x = false;
        boolean y = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a value for X (true or false):");
        String xValueAsString = sc.nextLine();
        if (xValueAsString.equals("true")) {
            x = true;
        }
        else if (xValueAsString.equals("false")) {
            x = false;
        }
        else {
            System.out.println("You have entered a wrong value for X");
            return;
        }
        System.out.println("Please, enter a value for Y (true or false):");
        String yValueAsString = sc.nextLine();
        if (yValueAsString.equals("true")) {
            y = true;
        }
        else if (yValueAsString.equals("false")) {
            y = false;
        }
        else {
            System.out.println("You have entered a wrong value for Y");
            return;
        }

        System.out.println("x & y = " + (x && y));
        System.out.println("x | y = " + (x || y));
        System.out.println("x ^ y = " + (x ^ y));
    }

}
