package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert a number from -32768 to + 32767");
        int numberForCheck = sc.nextInt();
        if (numberForCheck < -32768 || numberForCheck >= 32768) {
            System.out.println("Your number is out of range!");
            return;
        }
        short number = (short)numberForCheck;


    }
}
