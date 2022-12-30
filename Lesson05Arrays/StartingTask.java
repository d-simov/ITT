package Lesson05Arrays;

import java.util.Scanner;

public class StartingTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Моля, въведете цяло, положително число:");
            number = Integer.parseInt(sc.nextLine());
        } while (number <= 0);

        int multiplication = 1;

        for (int i = 1; i < number; i++) {
            if (i % 3 != 0) {
                continue;
            }
            else {
                multiplication = multiplication * i;
            }
        }

        System.out.println("The multiplication of all numbers, that can be divided by 3 between 1 and " + number + " is " + multiplication);


    }

}
