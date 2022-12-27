package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number you entered is not positive.");
            return;
        }

        int counter = 0;

        while (number > 0) {
            int leftover = number % 2;
            if (leftover > 0) {
                counter++;
            }
            number /= 2;
        }
        System.out.println(counter + " bits are '1' in the binary representation of the number you entered.");
    }
}
