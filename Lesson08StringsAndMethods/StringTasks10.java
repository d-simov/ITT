package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks10 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int number2;
        do {
            System.out.print("Please, enter a positive number: ");
            number = sc.nextInt();
            System.out.print("Enter a positive number, smaller than the first one: ");
            number2 = sc.nextInt();
        } while ((number <= 0) || (number2 <= 0) || number2 >= number);

        StringBuilder sequenceAsString = new StringBuilder();

        for (int i = 0; i <= number; i++) {
            sequenceAsString.append("" + i);
        }

        System.out.println(sequenceAsString.indexOf(("" + number2)));
    }
}
