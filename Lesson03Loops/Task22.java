package Lesson03Loops;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете цяло число от интервала [1..999]");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 0;

        while (counter < 10) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                counter++;
                if (counter < 10) {
                    System.out.print(counter + ":" + number + ", ");
                }
                else {
                    System.out.print(counter + ":" + number);
                }
            }
            number++;
        }
    }
}
