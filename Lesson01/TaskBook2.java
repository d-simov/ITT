package Lesson01;

import java.util.Scanner;

public class TaskBook2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a value for first variable \"a1\":");
        int a1 = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter a value for first variable \"a2\":");
        int a2 = Integer.parseInt(sc.nextLine());
        System.out.println("Please, enter a value for first variable \"a3\":");
        int a3 = Integer.parseInt(sc.nextLine());

        System.out.println("The values of your variables are: " + a1 + ", " + a2 + ", " + a3 + ".");

        int temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;

        System.out.println("The new values of your variables are: " + a1 + ", " + a2 + ", " + a3 + ".");
    }


}
