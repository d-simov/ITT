package Lesson01;

import java.util.Scanner;

public class TaskBook3 {

    public static void main(String[] args) {

        System.out.println("Please, enter a positive 3-digit number:");
        Scanner sc = new Scanner(System.in);
        int initialNumber = Integer.parseInt(sc.nextLine());
        int invertedNumber = 0;

        if (initialNumber < 100 || initialNumber > 999) {
            System.out.println("You have entered a non-valid number.");
        }
        else {
            invertedNumber = initialNumber % 10;

            initialNumber/=10;
            int leftover2 = initialNumber % 10;
            invertedNumber = invertedNumber * 10 + leftover2;
            initialNumber/=10;
            int leftover3 = initialNumber % 10;
            invertedNumber = invertedNumber*10 + leftover3;
        }

        System.out.println("Inverted your number looks like " + invertedNumber);


    }

}
