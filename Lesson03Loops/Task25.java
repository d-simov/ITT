package Lesson03Loops;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        System.out.println("Моля въведете цяло число:");
        Scanner sc = new Scanner(System.in);
        int finalNumber = sc.nextInt();
        int multiplication = 1;
        int currentNum = 1;

        do {
            multiplication *= currentNum;
            currentNum++;
        } while (currentNum <= finalNumber);
        System.out.println(multiplication);
    }
}


