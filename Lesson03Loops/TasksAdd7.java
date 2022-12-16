package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd7 {

    public static void main(String[] args) {

        System.out.print("noun: ");
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();
        System.out.print("number = ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.print("noun: " + noun + ", number = " + number + "; -> " + number + " " + noun);
        }
        else {
            System.out.print("noun: " + noun + ", number = " + number + "; -> " + number + " " + noun + "s");
        }
    }
}
