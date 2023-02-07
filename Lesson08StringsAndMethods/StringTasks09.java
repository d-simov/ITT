package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks09 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.print("Please, enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);

        StringBuilder sequenceAsString = new StringBuilder();

        for (int i = 0; i <= number; i++) {
            sequenceAsString.append("" + i);
        }

        System.out.println(sequenceAsString);
    }
}
